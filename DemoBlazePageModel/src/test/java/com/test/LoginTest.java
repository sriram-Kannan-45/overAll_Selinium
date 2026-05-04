package com.test;

import org.testng.annotations.Test;

import com.itestListner.itestDemoBlaze;
import com.pages.loginPageDemoBlaze;
import com.util.excelDataSet;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


@Listeners(itestDemoBlaze.class)
public class LoginTest 

{
	
	
	
	public static  ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	
  @Test(dataProvider = "validData", dataProviderClass = excelDataSet.class)
  public void loginVal(String name , String pass ) 
  
  {
	  loginPageDemoBlaze objlogin = new loginPageDemoBlaze(getDriver());
		
	  
	  
	  String actual = objlogin.actionLogin(name , pass);
	  
	  String expect = "Welcome "+"admin";
	  
	  Assert.assertEquals(actual,expect);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() 
  
  {
	  driver.set(new ChromeDriver());
	  
	  getDriver().manage().window().maximize();
	  
	  getDriver().get("https://www.demoblaze.com/");
	  
  }

  @AfterMethod
  public void afterMethod()
  {
	  
	  getDriver().quit();
  }

}
