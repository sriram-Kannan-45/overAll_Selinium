package web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ById {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("chat gpt");
		
		search.submit();
		
		Thread.sleep(10000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
