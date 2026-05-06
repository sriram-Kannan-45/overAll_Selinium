package HomwWorkOut;


import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/dynamic-properties");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement changeClr = driver.findElement(By.id("colorChange"));
		
		String str = changeClr.getText();
		
		System.out.println(str);
		
		
	}

}
