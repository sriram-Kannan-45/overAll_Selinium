package select;

import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectDemo

{

	
	public static void main(String arg[])
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0b9iwuu60sk361cwpm43aajp3p14556638.node0");
		
		WebElement uiAuto = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		Select select = new Select(uiAuto);
		List<WebElement> options = select.getOptions();
		System.out.println("Total options: " + options.size());
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		Boolean isMultiple = select.isMultiple();
		System.out.println("Is multiple: " + isMultiple);
		select.selectByIndex(1);
		select.selectByVisibleText("Puppeteer");
		

	}
}
