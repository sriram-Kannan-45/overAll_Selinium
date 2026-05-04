package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginPageDemoBlaze

{
	
	WebDriver driver ;
	
	public loginPageDemoBlaze (WebDriver driver)
	{
		this.driver = driver ;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	By userName = By.id("loginusername");
	
	By userPass = By.id("loginpassword");
	  
	By loginBtn = By.xpath("//button[text()=\"Log in\"]");
	  
	By welcome = By.xpath("//a[text()=\"Welcome admin\"]");
	
	By login1 = By.xpath("//a[@id=\"login2\"]");
	
	WebDriverWait wait ;
	
	public void setUserName (String name) 
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(userPass)).sendKeys(name);
	}
	
	public void setPassWord (String pass)
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(userPass)).sendKeys(pass);
	}
	
	public void login1 ()
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(login1)).click();
	}
	
	public void loginBtn ()
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	}
	
	public String welcome()
	
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(welcome)).getText();
	}
	
	

	public String actionLogin(String name, String pass) {
		// TODO Auto-generated method stub
		
		login1 ();
		wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(name);
		wait.until(ExpectedConditions.elementToBeClickable(userPass)).sendKeys(pass);
		loginBtn ();
		return wait.until(ExpectedConditions.visibilityOfElementLocated(welcome)).getText();
	
	}

	
	
}
