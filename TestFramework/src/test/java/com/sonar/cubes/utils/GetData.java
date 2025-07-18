package com.sonar.cubes.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {
	
public static String fromExcel(String filepath, String sheet_name, int row, int col) throws IOException {
		
		File f = new File(filepath); 
		FileInputStream fis = new FileInputStream(f); 
		Workbook ws = new XSSFWorkbook(fis); 
		Sheet sh = ws.getSheet(sheet_name); 
		Row r = sh.getRow(row); 
		Cell c = r.getCell(col); 
		return c.getStringCellValue(); 
	}
	
	public static String fromProperty (String filepath, String key) throws IOException {
		File f = new File(filepath); 
		FileInputStream fis = new FileInputStream(f); 
		Properties prop = new Properties(); 
		prop.load(fis);
		return (String) prop.get(key); 
	}


}
