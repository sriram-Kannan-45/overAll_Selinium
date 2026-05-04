package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.loginPage;
public class loginTest extends BaseTests {
	
	
	
  @Test (priority = 0)
  public void login() 
  
  {
	  objLogin = new loginPage(driver);
	  
	  
	  String loginTitle =objLogin.getLoginTitle();
	  
	  Assert.assertTrue(loginTitle.contains("Login"));
	  
	 
	  
	  
  }
  
  
}
