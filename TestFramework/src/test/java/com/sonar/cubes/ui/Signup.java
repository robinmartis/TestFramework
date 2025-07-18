package com.sonar.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {
	
WebDriver driver; 
	
	public Signup(WebDriver driver) {
		this.driver=driver; 
	}
	
	public WebElement getFristNameTextBox() {
		WebElement element = driver.findElement(By.name("firstname")); 
		return element; 
	}
	
	public WebElement getSurnameNameTextBox() {
		WebElement element = driver.findElement(By.name("lastname")); 
		return element; 
	}
	
	
	

}
