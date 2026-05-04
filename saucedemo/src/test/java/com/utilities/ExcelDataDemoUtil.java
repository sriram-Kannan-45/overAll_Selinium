package com.utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataDemoUtil

{
	@DataProvider(name = "validData", parallel = true)

	public Object[][] valid() {
		Object[][] data = getExcel("D:\\selenium\\saucedemo\\src\\test\\resources\\data.xlsx", "sheet2");

		return data;
	}

	private Object[][] getExcel(String FileName, String sheet)

	{
		// TODO Auto-generated method stub
		String[][] data = null;

		try {
			FileInputStream files = new FileInputStream(FileName);

			XSSFWorkbook work = new XSSFWorkbook(files);

			XSSFSheet sheets = work.getSheet(sheet);

			XSSFRow row = sheets.getRow(0);

			int noOfRows = sheets.getPhysicalNumberOfRows();

			int noOfCols = row.getLastCellNum();

			Cell cell;

			data = new String[noOfRows - 1][noOfCols];

			for (int i = 1; i < noOfRows; i++) {
				for (int j = 0; j < noOfCols; j++) {
					row = sheets.getRow(i);

					cell = row.getCell(j);

					if (cell == null) {
					    data[i - 1][j] = "";   
					} else {
					    data[i - 1][j] = cell.toString();
					}

				}
			}
		}

		catch (Exception e) {
			System.out.println("The exception is : " + e.getMessage());
		}

		return data;
	}
}
