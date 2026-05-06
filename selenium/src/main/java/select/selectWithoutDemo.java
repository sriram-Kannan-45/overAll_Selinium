package select;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class selectWithoutDemo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only\"]")));
		
		dropDown.click();
		
		List<WebElement> options = wait.until(
			    ExpectedConditions.visibilityOfAllElementsLocatedBy(
			        By.xpath("//span[@id=\"j_idt87:auto-complete_panel\"]/ul")
			    )
			);

		for (WebElement option : options) 
		{
            for(WebElement item : option.findElements(By.tagName("li"))  ) {
                if (item.getText().equals("Selenium WebDriver")  || item.getText().equals("Appium") || item.getText().equals("Playwright") ) {
                    item.click();
                    
                }
            }
			
		}
	}
}