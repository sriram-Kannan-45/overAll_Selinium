
package Synchronize;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo

{

	public static void main(String arg[]) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		
		
		driver.findElement(By.linkText("Facebook")).click();
		
	}

}
