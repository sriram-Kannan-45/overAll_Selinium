package Synchronize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGround_P3 {

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/waits.xhtml");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Click first button
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();

		By growl = By.className("ui-growl");

		// STEP 1: Wait for popup to appear
		wait.until(ExpectedConditions.presenceOfElementLocated(growl));

		// STEP 2: Wait for popup to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(growl));

		// STEP 3: Now click second button
		wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//span[text()='Click Second']")
		)).click();

		System.out.println("Clicked successfully!");
	}

}
