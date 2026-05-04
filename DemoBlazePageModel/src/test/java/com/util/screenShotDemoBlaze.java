package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import com.test.LoginTest;


import java.io.*;

public class screenShotDemoBlaze

{
	
	public static String capture(String testName) 
	{
		try 
		{
			WebDriver driver = LoginTest.getDriver();
			
			String timeStamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
			
			String path = "ss/"+testName+"_"+timeStamp+".png";
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File(path));
			
			 

	            return path;
			
		}
		
		catch (Exception e) {
            
            return "Screenshot failed";
        }
	}

}
