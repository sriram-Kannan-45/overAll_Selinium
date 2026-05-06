package Synchronize;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplictWait_Practice {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		 driver.findElement(By.id("reveal")).click();
		
		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
		
		text.sendKeys("sriam");
		
		String txt = text.getText();
		
		System.out.println(txt);
		
		driver.close();
		
	}

}
