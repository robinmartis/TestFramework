package com.sonar.cubes.ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver; 
	
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
	}
	
	
	public void waitForLoginPage() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("u_0_2_7m"))); 
	}
	
	public WebElement getEmailTextbox() {
		WebElement element = driver.findElement(By.name("email")); 
		return element; 
	}
	
	public WebElement getPasswordTextbox() {
		WebElement element = driver.findElement(By.name("pass")); 
		return element; 
	}
	
	public WebElement getLoginButton() {
		WebElement element = driver.findElement(By.name("login")); 
		return element; 
	}
	
	public WebElement getLoginErrorMessage_Label()  {
		WebElement element = driver.findElement(By.partialLinkText("incorrect"));
		return element; 
	}
	
	
	public WebElement getCreateNewAccountButton() {
		WebElement element = driver.findElement(By.linkText("Create new account")); 
		return element; 
	}
	
	

}
