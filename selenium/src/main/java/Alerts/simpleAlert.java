package Alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlert {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement simpleAlt = driver.findElement(By.xpath("//input[@id=\"alert1\"]"));
		
		simpleAlt.click();
		
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();

	}

}
