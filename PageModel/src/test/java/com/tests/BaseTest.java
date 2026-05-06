package com.tests;

import org.testng.annotations.Test;

import com.pages.dashboardPage;
import com.pages.loginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class BaseTest {
  
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	dashboardPage  objDash ;
	
	loginPage objLogin ;
	
	public static final Logger log = LogManager.getLogger(BaseTest.class);
	
  @BeforeMethod
  public void setup() 
  
  {
	  
	  try 
	  {
		  
		  
		  driver.set(new ChromeDriver());  
		  
		  getDriver().manage().window().maximize();
		  
		  log.info("Maximizing the Window.......");
		  
		  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  log.info("driver opening.........");
	  }
	  
	  catch (Exception e)
	  {
		  log.error("driver not open......,{}",e);
		  
		  throw e ;
	  }
	  
  }

  @AfterMethod
  public void afterClass() 
  
  
  {
	  try
	  {
		  log.info("driver Closing......");
		  
		  getDriver().quit();
		  
		  
		  driver.remove();
	  }
	  
	  catch (Exception e)
	  {
		  log.error("Driver not closing...,{}",e);
		  
		  throw e ;
	  }
	  
  }
  
  public static WebDriver getDriver()
  {
	  return driver.get();
  }

}
