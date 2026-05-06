package Synchronize;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class implicitWaitPractice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		driver.findElement(By.id("adder")).click();
		
		WebElement red_box = driver.findElement(By.className("redbox"));
		
		String dom = red_box.getCssValue("font");
		
		System.out.println(dom);
		
		driver.quit();

	}

}
