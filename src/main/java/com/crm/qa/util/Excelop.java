package com.crm.qa.util;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelop {

	public void getExcelData()
	{
		String FilePath="D:\\TestData.xlsx";
		FileInputStream fis=new FileInputStream(FilePath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		
	}
	
}
