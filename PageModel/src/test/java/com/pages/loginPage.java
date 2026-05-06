package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage
{
	WebDriver driver ;
	
	By title = By.xpath("//h5[text()=\"Login\"]");
	
	By userName = By.xpath("//input[@name=\"usernae\"]");
	
	By passWord = By.xpath("//input[@name=\"password\"]");
	
	By loginBtn = By.xpath("//button[text()=\" Login \"]");
	
	By InValid = By.xpath("//p[text()=\"Invalid credentials\"]");
	
	WebDriverWait wait ;
	
	public loginPage(WebDriver webDriver)
	{   
		this.driver = webDriver ;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void setUserName (String name)
	{
		driver.findElement(userName).sendKeys(name);
	}
	
	
	public void setPassWord (String pass)
	{
		driver.findElement(passWord).sendKeys(pass);
	}
	
	
	public void clickLogin ()
	{
		driver.findElement(loginBtn).click();
	}
	
	
	public String getLoginTitle()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(title)).getText();
	}
	
	public String getInvalLogin()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(InValid)).getText();
	}
	
	public void login(String userName, String pass) 
	{
        setUserName(userName);   
        setPassWord(pass);
        clickLogin();
    }
}
