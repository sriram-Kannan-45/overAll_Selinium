package autoIt;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class withSelenium 

{
	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.id("uploadFile")));
		
		upload.sendKeys("C:\\Users\\user\\Downloads\\requirements.txt");
		
		String msg = driver.findElement(By.id("uploadedFilePath")).getText();
		
		
		
	}
	

}
