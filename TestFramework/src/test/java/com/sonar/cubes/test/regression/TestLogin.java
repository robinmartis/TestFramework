package com.sonar.cubes.test.regression;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sonar.cubes.ui.LoginPage;
import com.sonar.cubes.ui.Signup;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin{

	WebDriver driver; 
	LoginPage login; 
	Signup signup; 
	
	@BeforeMethod
	public void pre() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.facebook.com/");
		login = new LoginPage(driver); 	
		signup = new Signup(driver); 
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		login.waitForLoginPage();
		login.getEmailTextbox().sendKeys("test@test.com");
		login.getPasswordTextbox().sendKeys("abcd");
		login.getLoginButton().click();
	}
	
	@Test
	public void validateUsernameText() {
		login.waitForLoginPage();
		String text = login.getEmailTextbox().getAttribute("aria-label");
		System.out.println(text);
		String expected = "Email address or phone number"; 
		Assert.assertEquals(text, expected);
	}
	
	@Test
	public void validateCreateNewAccount() {
		login.waitForLoginPage();
		login.getCreateNewAccountButton().click();
		String actual = driver.getTitle(); 
		System.out.println(actual);
		String expected = "Sign up for Facebook"; 
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void enterName() throws InterruptedException {
		login.getCreateNewAccountButton().click();
		signup.getFristNameTextBox().sendKeys("Robin");
		signup.getSurnameNameTextBox().sendKeys("Martis");
//		Thread.sleep(10000);
	}
	
	
	@Test
	public void loginTest_1() throws InterruptedException {
		login.waitForLoginPage();
		login.getEmailTextbox().sendKeys("test@test.com");
		login.getPasswordTextbox().sendKeys("abcd");
		login.getLoginButton().click();
	}
	
	
	@AfterMethod
	public void post() {
		driver.close();
	}
	
}
