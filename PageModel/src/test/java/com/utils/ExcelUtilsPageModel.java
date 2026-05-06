package com.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtilsPageModel 

{
 
	@DataProvider(name = "validLogin" , parallel = true)
	
	public Object[][] validData() throws IOException
	
	{
		Object[][] data = getExcelData("D:\\selenium\\PageModel\\src\\test\\resources\\data.xlsx","sheet1");
		
		return data;
	}

	private Object[][] getExcelData(String file, String sheet) 
	{
		// TODO Auto-generated method stub
		
		String [][] data = null ;
		
		try 
		{
			FileInputStream files = new FileInputStream(file);
			
			XSSFWorkbook work = new XSSFWorkbook(files);
			
			XSSFSheet sheets = work.getSheet(sheet);
			
			XSSFRow row = sheets.getRow(0);
			
			int noOfRows = sheets.getPhysicalNumberOfRows();
			
			int noOfCols = row .getLastCellNum();
			
			Cell cell ;
			
			data = new String [noOfRows-1][noOfCols];
			
			for (int i = 1 ; i < noOfRows ; i++)
			{
				for (int j = 0 ; j < noOfCols ; j++ )
				{
					row = sheets.getRow(i);
					
					cell = row.getCell(j);
					
					data[i-1][j] = cell.getStringCellValue();
					
				}
			}
		}
		
		catch (Exception e)
		{
			System.out.println("The exception is : "+e.getMessage());
		}
		
		return data;
		
		
		
	}
	
	

}
