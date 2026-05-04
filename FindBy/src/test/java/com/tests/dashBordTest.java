package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.dashboardPage;
import com.pages.loginPage;

public class dashBordTest extends BaseTests {
	
	
  @Test
  public void dashTest() 
  {
	  objLogin = new loginPage(driver);
	  
	  objLogin.login("Admin", "admin123");
	  
	  dashboardPage objDash = new dashboardPage(driver);
	  
	  String actual = objDash.getHomePageText();
	  
	  String expect = "Dashboard";
	  
	  Assert.assertEquals(expect , actual );
  }
}
