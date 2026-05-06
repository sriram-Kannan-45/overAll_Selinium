package select;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectActionDemo 

{
	public static void main (String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement ele = driver.findElement(By.xpath("//select[@class = \"ui-selectonemenu\"]"));
//		
		Actions act = new Actions(driver);
//		
		act.moveToElement(ele).perform();
		
		WebElement Option2 = driver.findElement(By.xpath("//option[text()=\"Playwright\"]"));
		act.moveToElement(Option2).click().build().perform();
	}
}
