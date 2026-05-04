package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class dashBoard extends BasePage
{
	
	
	@FindBy( xpath = "//h6[text()=\\\"Dashboard\\\"]")
	
	public WebElement dashboardTitle ;
	

	public dashBoard(WebDriver driver) 
	
	{
		super(driver);
	}
	
	public String getHomePageText()
	{
		return dashboardTitle.getText();
	}
	
}
  
