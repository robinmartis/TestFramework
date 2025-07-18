package com.sonar.cubes.test.smoke;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sonar.cubes.utils.GetData;
import com.sonar.cubes.utils.SetData;

public class TestGenericFunction {
	
	
	@Test
	public void test() throws IOException {
		String excel_filepath = "C:\\Technical\\Eclipse_Workspace\\Java_Programs\\src\\filesHandling\\Data.xlsx";
		System.out.println(GetData.fromExcel(excel_filepath, "Sheet1", 1, 0)); 
		
		SetData.toExcel(excel_filepath, "Sheet1", 8, 3, "URL is www.xyz.com");
		System.out.println(GetData.fromExcel(excel_filepath, "Sheet1", 8, 3)); 
		
		
		String PropFilePath = "C:\\Technical\\Eclipse_Workspace\\Java_Programs\\src\\filesHandling\\config.properties"; 
		System.out.println("Value of username is : " +GetData.fromProperty(PropFilePath, "username"));
		
		SetData.toProperty(PropFilePath, "build_version", "10.3.2.3", "Adding build version");
		System.out.println("Value of build_version is : " +GetData.fromProperty(PropFilePath, "build_version"));
		
		
	}
	

}
