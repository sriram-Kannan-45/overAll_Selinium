package com.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 

{
	
	WebDriver driver;
	
	WebDriverWait wait ;
	
	By userName = By.xpath("//input[@id = \"user-name\"]");
	
	By userPass = By.xpath("//input[@id = \"password\"]");
	
	By userLogin = By.xpath("//input[@id = \"login-button\"]");
	
	By Text = By.xpath("//span[text()=\"Products\"]");
	
	By inValError = By.xpath("//button[@class=\"error-button\"]");
	
	public LoginPage(WebDriver driver)
	
	{
		
		this.driver = driver ;
		
		this.wait = new WebDriverWait(driver , Duration.ofSeconds(10)) ;
		
	}
	
	public String valAction(String name ,String pass)
	{
		wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(name);
		
		wait.until(ExpectedConditions.elementToBeClickable(userPass)).sendKeys(pass);
		
		wait.until(ExpectedConditions.elementToBeClickable(userLogin)).click();
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Text)).getText();
		
		
	}
	
	public String inValAction(String name ,String pass)
	{
		wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(name);
		
		wait.until(ExpectedConditions.elementToBeClickable(userPass)).sendKeys(pass);
		
		wait.until(ExpectedConditions.elementToBeClickable(userLogin)).click();
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(inValError)).getText();
		
		
	}

	

}
