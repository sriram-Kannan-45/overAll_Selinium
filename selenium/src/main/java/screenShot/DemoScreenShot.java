package screenShot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot 
{

	public static void main(String [] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.testim.io/");
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File source = sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./ScreenShot/sc1.png"));
		
		System.out.println("SS");
		
		driver.quit();
	}
}
