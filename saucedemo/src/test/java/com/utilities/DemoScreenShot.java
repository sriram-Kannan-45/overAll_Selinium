package com.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.test.LoginTest;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class DemoScreenShot 

{
	
	public static String capture (String testName)
	{
		try 
		
		{
			
			WebDriver driver = LoginTest.getDriver();
			
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			
			String path = "screenShots/" + testName + "_" + timeStamp + ".png" ;
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File(path));
			
			return path ;
		}
		
		catch (Exception e)
		{
			System.out.println(e);
			
		}
		return "no";
	}

}
