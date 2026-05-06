package ActionsDemo;

import org.openqa.selenium.interactions.Actions;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsDemo2 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Actions act = new Actions (driver);
		
		WebElement dClick = driver.findElement(By.xpath("//button[text()=\" Double click Here   \"]"));
		
		act.doubleClick(dClick).perform();

	}

}
