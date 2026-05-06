
package Synchronize;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class ImplicitDemo

{

	public static void main(String arg[]) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		
		
		driver.findElement(By.linkText("Facebook")).click();
		
	}

}
