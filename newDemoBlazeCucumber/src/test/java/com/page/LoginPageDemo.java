package com.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageDemo 

{
	
	WebDriver driver ;
	
	WebDriverWait wait ;
	
	
	
	public LoginPageDemo(WebDriver driver2) {
		
		this.driver = driver2 ;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
		// TODO Auto-generated constructor stub
	}

	By userName = By.id("loginusername");
	
	By userPass = By.id("loginpassword");
	  
	By loginBtn = By.xpath("//button[text()=\"Log in\"]");
	  
	By welcome = By.xpath("//a[text()=\"Welcome admin\"]");
	
	By login1 = By.xpath("//a[@id=\"login2\"]");
	
	public void setUsername(String name)
	{
		wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(name);
	}
	
	public void getLoginBtn1 ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(login1)).click();
	}
	
	public void setUserPass(String pass)
	{
		wait.until(ExpectedConditions.elementToBeClickable(userPass)).sendKeys(pass);
	}
	
	public void getLoginBtn ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	}
	
	public void asserLogin()
	{
		String expect = "Welcome admin";
		
		String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(welcome)).getText();
		
		Assert.assertEquals(expect, actual);
	}

}
