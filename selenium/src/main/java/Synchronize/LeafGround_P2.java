package Synchronize;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_P2 {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement before_txt = driver.findElement(By.xpath("//span[text()=\"I am going to change!\"]"));
		
		String txt1 = before_txt.getText();
		
		System.out.println("BEFORE : "+txt1);
		
		driver.findElement(By.xpath("//button[@id=\"j_idt87:j_idt98\"]/span")).click();
		
		WebElement after_text = driver.findElement(By.xpath("//span[text()=\"Did you notice?\"]"));
		
		String txt2 = after_text.getText();
		
		System.out.println("AFTER : "+txt2);
		
		driver.quit();
	}

}
