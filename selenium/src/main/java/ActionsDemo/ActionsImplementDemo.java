package ActionsDemo;

import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActionsImplementDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions (driver);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement blogsmenuElement = driver.findElement(By.id("blogsmenu"));
		
		
		
		act.moveToElement(blogsmenuElement).perform();
		
		WebElement Option2 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		act.moveToElement(Option2).click().build().perform();
	}

}
