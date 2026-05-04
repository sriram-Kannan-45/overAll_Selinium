package com.tests;

import org.testng.annotations.Test;

import com.pages.dashboardPage;
import com.pages.loginPage;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseTests {
  
	public static WebDriver driver;
	
	dashboardPage  objDash ;
	
	loginPage objLogin ;
	
	public static final Logger log = LogManager.getLogger(BaseTests.class);
	
  @BeforeClass
  public void setup() 
  
  {
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  log.info("Maximizing the Window.......");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  log.info("driver opening.........");
	  
	  
  }

  @AfterClass
  public void afterClass() 
  
  
  {
	  
	  log.info("driver Closing......");
	  
	  driver.quit();
  }

}
