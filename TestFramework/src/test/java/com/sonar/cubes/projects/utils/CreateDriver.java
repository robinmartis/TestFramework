package com.sonar.cubes.projects.utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sonar.cubes.utils.GetData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDriver {
	
	public static WebDriver getDriver() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		String url = GetData.fromProperty("C:\\Technical\\Eclipse_Workspace\\TestFramework\\Config\\config.properties", "URL"); 
		
		driver.get(url);
		
		return driver; 
		
	}

}
