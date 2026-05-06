package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.tests.BaseTest;

import java.io.File;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

public class screenShot 

{
	private static final Logger log = LogManager.getLogger(screenShot.class);
	
	public static  String capture (String name)
	{
		try 
		{
			WebDriver driver = BaseTest.getDriver();
			
			String timeStamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
			
			String path = "ss/"+name+"_"+timeStamp+".png";
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File(path));
			
			 log.info("Screenshot captured: {}", path);

	            return path;
			
		}
		
		catch (Exception e) {
            log.error("Screenshot failed", e);
            return "Screenshot failed";
        }
	}


}
