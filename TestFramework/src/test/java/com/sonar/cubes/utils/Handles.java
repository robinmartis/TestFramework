package com.sonar.cubes.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handles {
	
	public static void acceptAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert(); 
		alt.accept();
	}
	
	public static void dismissAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert(); 
		alt.dismiss();
	}
	
	public static String getAlertText(WebDriver driver) {
		Alert alt = driver.switchTo().alert(); 
		return alt.getText(); 
	}
	
	public static void EnterText(WebDriver driver, String data) {
		Alert alt = driver.switchTo().alert(); 
		alt.sendKeys(data);
	}
	
	public static void selectDDLByIndex(WebElement element, int index) {
		Select sct = new Select(element);
		sct.selectByIndex(index);
	}
	
	public static void selectDDLByText(WebElement element, String text) {
		Select sct = new Select(element); 
		sct.selectByVisibleText(text);
	}
	
	public static void selectDDLByValue(WebElement element, String value ) {
		Select sct = new Select(element); 
		sct.selectByValue(value);
	}
	
	

}
