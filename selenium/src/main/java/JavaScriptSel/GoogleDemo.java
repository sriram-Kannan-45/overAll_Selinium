package JavaScriptSel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.*;

public class GoogleDemo 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		
		
//		driver.get("https://www.google.com/");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html?m=1");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		js.executeScript("window.scrollBy(0,500);");

		
		js.executeScript("document.getElementsByName('name')[0].value='sriram';");
		
		js.executeScript("document.getElementsByName('name')[1].value='kannan';");

	}

}
