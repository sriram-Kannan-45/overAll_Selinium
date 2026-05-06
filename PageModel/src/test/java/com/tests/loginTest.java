package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.loginPage;
public class loginTest extends BaseTest {
	
	
	
  @Test (priority = 0)
  public void login() 
  
  {
	  
	try 
	{

		  objLogin = new loginPage(getDriver());
		  
		  
		  String loginTitle = objLogin.getLoginTitle();
		  
		  Assert.assertTrue(loginTitle.contains("Login"));
		  
		  log.info("Login.....");
	}
	
	catch (Exception e) 
	
	{
		
		log.error("Not Login...");
	}
	
	
  }
  
  
}
