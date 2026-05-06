package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfRowCol {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> col_datas = driver.findElements(By.xpath("//table[@id=\"table1\"]//thead/tr/th"));
		
		List<WebElement> row_datas =  driver.findElements(By.xpath("//table[@id=\"table1\"]//td"));
		
		
//		for (WebElement data : datas )
//		{
//			System.out.println(data.getText());
//		}

		System.out.println("no of columns : "+col_datas.size());
		System.out.println("no of rows : "+row_datas.size());
	}

}
