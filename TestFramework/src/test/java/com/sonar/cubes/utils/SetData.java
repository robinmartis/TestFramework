package com.sonar.cubes.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetData {
	
public static void toExcel(String filepath, String sheetname, int row, int col, String value) throws IOException {
		
		File f = new File(filepath); 
		FileInputStream fis = new FileInputStream(f); 
		Workbook ws = new XSSFWorkbook(fis); 
		Sheet s = ws.getSheet(sheetname); 
		
		if (s == null) {
		        s = ws.createSheet(sheetname);
		    }
		 
		Row r = s.getRow(row); 
		
		if (r == null) {
		    r = s.createRow(row);
		}
		
		Cell c = r.createCell(col); 
		c.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(f); 
		ws.write(fos);
		ws.close();
		
	}
	
	public static void toProperty(String filepath, String key, String value, String Comments ) throws IOException {
		
		File f = new File(filepath); 
		FileInputStream fis = new FileInputStream(f); 
		Properties prop = new Properties(); 
		prop.load(fis);
		prop.setProperty(key, value); 
		FileOutputStream fos = new FileOutputStream(f); 
		prop.store(fos, Comments);
	}


}
