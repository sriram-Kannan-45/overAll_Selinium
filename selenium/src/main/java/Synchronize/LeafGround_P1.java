package Synchronize;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGround_P1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("//button[@id=\"j_idt87:j_idt89\"]/span")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@id=\"j_idt87:j_idt90\"]/span")).click();
		
		driver.quit();
	}

}
