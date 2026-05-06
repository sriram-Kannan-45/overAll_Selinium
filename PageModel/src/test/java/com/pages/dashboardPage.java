package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class dashboardPage
{
	WebDriver driver;
	
	
	By dashBoard = By.xpath("//h6[text()=\"Dashboard\"]");

	public dashboardPage(WebDriver webDriver) 
	
	{
		
		this.driver = webDriver;
	}
	
	

	public String getHomePageText()
	{
		return driver.findElement(dashBoard).getText();
	}
	
}
  
