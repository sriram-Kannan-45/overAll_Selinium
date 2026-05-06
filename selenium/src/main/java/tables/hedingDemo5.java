package tables;


import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class hedingDemo5 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> datas = driver.findElements(By.xpath("//table[@id=\"table1\"]//td"));
		
		System.out.println(datas.size());
		
		for (WebElement data : datas )
		{
			System.out.println(data.getText());
		}
		
	}

}
