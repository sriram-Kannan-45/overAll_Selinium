package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCMD {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.smartcliff.in");
		
		Thread.sleep(2000);
		
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		driver.quit();
		

		
		
	}

}
