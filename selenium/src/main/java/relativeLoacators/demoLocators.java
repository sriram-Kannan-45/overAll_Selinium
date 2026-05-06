package relativeLoacators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class demoLocators

{
	public static void main(String args[]) 
	
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@maxlength = 10]"));
        firstName.sendKeys("Sriram");

        
        WebElement lastName = driver.findElement(
                with(By.name("name")).below(firstName)
        );
        lastName.sendKeys("Kannan");
//		
		WebElement pass = driver.findElement(By.xpath("//label[@for = \"psw-repeat\"]/preceding::input[@type = \"password\"]"));
		
		pass.sendKeys("sriram123@");
		
		WebElement email = driver.findElement(with(By.tagName("input")).above(pass));
		
		email.sendKeys("titooram123@gmail.com");
		
		WebElement reg = driver.findElement(
			    By.xpath("//button[normalize-space()='Register']")
			);

		WebElement clr = driver.findElement(
			    with(By.className("btn")).toRightOf(reg)
			);

			clr.click();
	}
}
