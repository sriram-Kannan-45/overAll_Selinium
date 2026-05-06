package Synchronize;


import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement btn3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerButton")));
		
		btn3.click();
		
		WebElement text = driver.findElement(By.id("deletesuccess"));
		
		WebElement clickAfter = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("alert2")));
		
		clickAfter.click();
		
		
	}

}
