package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		
		int len = title.length();
		
		System.out.println(title+"\nthe title length "+len);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("System URL : "+url);
		
		String page = driver.getPageSource();
		
		System.out.println(page.length());
		
		driver.quit();

	}

}
