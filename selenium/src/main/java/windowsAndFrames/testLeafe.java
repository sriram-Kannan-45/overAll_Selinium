package windowsAndFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLeafe {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parentHandle = driver.getWindowHandle();
				
				
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		
		Set <String> handle = driver.getWindowHandles();
		
		for (String id : handle) 
		{
		    if (!id.equals(parentHandle)) 
		    {
		        driver.switchTo().window(id);  
		        driver.close();               
		    }
		}
		

	}

}
