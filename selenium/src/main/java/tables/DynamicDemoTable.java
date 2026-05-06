package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDemoTable {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> col_datas = driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		
		int col = col_datas.size();
		
		List<WebElement> row_datas =  driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
		
		int row = row_datas.size();
		
		WebElement data ;
		
		System.out.println(col + " "+row);
		for(int i = 1 ; i<=row ; i++)
		{
			for (int j = 1 ; j<=col ; j++)
			{
				if (i==1)
				{
					data = driver.findElement(By.xpath("//table[@id=\"table1\"]//thead/tr/th["+j+"]"));
					System.out.print(data.getText()+" ");
				}
				
				else
				{
					data = driver.findElement(By.xpath("//table[@id=\"table1\"]//tbody//tr["+(i-1)+"]/td["+j+"]"));
					System.out.print(data.getText()+" ");
				}
			}
			System.out.println();
		}
//		

	}

}
