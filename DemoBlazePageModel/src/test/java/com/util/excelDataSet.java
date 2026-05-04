package com.util;

import org.testng.annotations.Test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excelDataSet {
	
	@DataProvider(name = "validData" , parallel = true)
	
	public Object[][] valid()
	{
		Object [][] data = getExcelData("D:\\selenium\\DemoBlazePageModel\\src\\test\\resources\\data.xlsx","sheet1");
		
		return data ;
	}

	private Object[][] getExcelData(String filePath, String sheet) 
	
	{
		// TODO Auto-generated method stub
		String[][] data = null ;
		
		try 
		{
			FileInputStream file = new FileInputStream(filePath);
			
			XSSFWorkbook work = new XSSFWorkbook(file);
			
			XSSFSheet sheets = work.getSheet(sheet);
			
			XSSFRow row = sheets.getRow(0);
			
			int noRow = sheets.getPhysicalNumberOfRows();
			
			int noCol = row.getLastCellNum();
			
			data = new String [ noRow - 1][noCol] ;
			
			Cell cell ;
			
			for (int i=1 ; i < noRow ; i++)
			{
				for (int j = 0 ; j < noCol ; j++)
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
		
		return data ;
	}
	

}
