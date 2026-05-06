package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.itest.itestDemo;

import com.pages.dashboardPage;
import com.pages.loginPage;

import com.utils.ExcelUtilsPageModel;

@Listeners(itestDemo.class)

public class dashBordTest extends BaseTest {
	
	
	 @Test(dataProvider = "validLogin", dataProviderClass = ExcelUtilsPageModel.class)
	    public void loginVaildTest(String name , String pass) 
	 {

	        loginPage login = new loginPage(getDriver());
	        login.login( name , pass );

	        dashboardPage dash = new dashboardPage(getDriver());

	        String actual = dash.getHomePageText();

	        Assert.assertEquals(actual, "Dashboard");

	        log.info("valid Login verified");
	   }
	 
	 @Test
	    public void loginInVaildTest() 
	 {

		    loginPage login = new loginPage(getDriver());
		    
		    login.login("Admin", "admin12");

		   
		    String actual = login.getInvalLogin();

		    Assert.assertEquals(actual,"Invalid credentials");

		    log.info("Invalid login verified");
	   }
}
