package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import jdk.internal.org.jline.utils.Log;

public class loginPage extends BasePage {

	@FindBy(xpath = "//h5[text()=\\\"Login\\\"]")

	public WebElement loginTitle;

	@FindBy(xpath = "//input[@name=\\\"username\\\"]")

	public WebElement userName;

	@FindBy(xpath = "//input[@name=\\\"password\\\"]")

	public WebElement passWord;

	@FindBy(xpath = "//button[text()=\\\" Login \\\"]")

	public WebElement loginBtn;

	public loginPage(WebDriver driver)
	
	{
		super(driver);
	}

	public void setUserName(String name) 
	
	{
		userName.sendKeys(name);

	}

	public void setPassWord(String pass) 
	
	{
		passWord.sendKeys(pass);
	}

	public void clickLogin() 
	
	{
		loginBtn.click();
	}

	public String getLoginTitle() 
	
	{
		return loginTitle.getText();
	}

	public void login(String name, String Pass) 
	
	{
		userName.sendKeys(name);

		passWord.sendKeys(Pass);
		
		loginBtn.click();
	}
}
