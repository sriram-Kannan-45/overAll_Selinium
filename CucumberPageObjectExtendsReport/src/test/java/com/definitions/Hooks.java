package com.definitions;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.utilities.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
public class Hooks 

{
	
	private static final Logger log = LogManager.getLogger(Hooks.class);
	
	@Before
	public static void setup(Scenario scenario) 
	{
		HelperClass.setupDriver();
		HelperClass.getDriver().navigate().refresh();
		log.info("senario started: {}",scenario.getName());
	}
	@After
	public static void Teardown(Scenario scenario) 
	
	{
		
		if (scenario.isFailed())
		{
			File screenshotFile = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.FILE);
			
			try
			{
				File destinationFile = new File ("screenShots/"+scenario.getName().replaceAll(" ", "_")+".png");
                FileUtils.copyFile(screenshotFile, destinationFile);
                
                byte[] screenshotBytes = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
                
                scenario.attach(screenshotBytes, "image/png", scenario.getName());
                
                log.info("Scenario Failes: {}",scenario.getName());
                
			}
			
			catch (Exception e) {
				log.error("Error while taking screenshot: {}", e.getMessage());
			}
		}
		
		else {
			log.info("Scenario Passed: {}", scenario.getName());
		}
		
		HelperClass.teardown();
	}
}
