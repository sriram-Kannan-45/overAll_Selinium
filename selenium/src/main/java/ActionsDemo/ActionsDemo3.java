package ActionsDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3 {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01jwou8e4zpmm3dlfwo6puqut314534178.node0");

		Actions act = new Actions(driver);

		WebElement ele_1 = driver.findElement(By.xpath("//div[@id=\"form:drag_content\"]"));

		WebElement ele_2 = driver.findElement(By.xpath("//div[@id=\"form:drop_content\"]"));
		
//		act.dragAndDrop(ele_1, ele_2).perform();
		
		act.clickAndHold(ele_1).moveToElement(ele_2).release().build().perform();

	}

}
