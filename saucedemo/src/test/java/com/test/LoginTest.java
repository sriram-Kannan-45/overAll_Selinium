package com.test;

import org.testng.annotations.Test;

import com.itest.ItestDemo;
import com.page.LoginPage;
import com.utilities.ExcelDataDemoUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


@Listeners(ItestDemo.class)
public class LoginTest {
	
	public static  ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	
  @Test(dataProvider = "validData" , dataProviderClass =  ExcelDataDemoUtil.class)
//  @Parameters({"userName","passWord"})
  public void valLogin( String name , String pass) 
  
  {
	  LoginPage objLogin = new LoginPage(getDriver());
	  
	  String actual = objLogin.valAction(name , pass);
	  
	  String expect = "Products" ;
	  
	  Assert.assertEquals(actual, expect);
	  
	  
  }
  
  @Test
  public void inValLogin() 
  
  {
	  LoginPage objLogin = new LoginPage(getDriver());
	  
	  String actual = objLogin.inValAction("standard_use" , "secret_sauce");
	  
	  String expect = "Epic sadface" ;
	  
	  Assert.assertTrue(expect.contains(actual));
	  
	  
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  ChromeOptions options = new ChromeOptions();

	  Map<String, Object> prefs = new HashMap<>();
	  
	  prefs.put("profile.default_content_setting_values.notifications", 2); 

	  options.setExperimentalOption("prefs", prefs);
	  
	  driver.set(new ChromeDriver(options));
	  
	  getDriver().get("https://www.saucedemo.com/");

  }

  @AfterMethod
  public void afterMethod() 
  {
	  
	  getDriver().quit();
	  
	  driver.remove();
  }

}
