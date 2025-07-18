package com.sonar.cubes.test.smoke;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sonar.cubes.projects.utils.CreateDriver;
import com.sonar.cubes.ui.LoginPage;
import com.sonar.cubes.ui.Signup;

public class TestLoginUS003 {
	
	WebDriver driver; 
	LoginPage loginPage; 
	Signup signup; 
	
	@BeforeMethod
	public void setup() throws IOException {
		driver = CreateDriver.getDriver(); 
		loginPage = new LoginPage(driver); 
		signup = new Signup(driver); 
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		loginPage.waitForLoginPage();
		loginPage.getEmailTextbox().sendKeys("test@test.com");
		loginPage.getPasswordTextbox().sendKeys("abcd");
		loginPage.getLoginButton().click();
	}
	
	@Test
	public void validateUsernameText() {
		loginPage.waitForLoginPage();
		String text = loginPage.getEmailTextbox().getAttribute("aria-label");
		System.out.println(text);
		String expected = "Email address or phone number"; 
		Assert.assertEquals(text, expected);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
