package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo4 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01jwou8e4zpmm3dlfwo6puqut314534178.node0");

		Actions act = new Actions(driver);

		WebElement ele_1 = driver.findElement(By.id("form:conpnl_content"));
		
//		act.dragAndDropBy(ele_1, 70, 0).perform();
		
		act.clickAndHold(ele_1).moveByOffset(70,0).release().build().perform();
		
	}

}
