package Synchronize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickAfterDel {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement text = driver.findElement(By.id("deletesuccess"));
		
		String out = text.getText();
		
		System.out.println(out);

		WebElement clickAfter = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("alert2")));

		clickAfter.click();

	}

}
