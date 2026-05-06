package HomwWorkOut;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablePrint {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"product\" and @name=\"courses\"]//th"));
		
		System.out.println(row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"product\" and @name=\"courses\"]//tr"));
		
		System.out.println(col.size()-1);
		
		WebElement data;
		for (int i = 1 ; i<=col.size() ; i++ )
		{
			for (int j = 1 ; j<=row.size() ; j++)
			{
				if (i==1)
				{
					
				data = driver.findElement(By.xpath("//table[@id=\"product\" and @name=\"courses\"]/tbody/tr["+i+"]/th["+j+"]"));
				System.out.print(data.getText()+"  ");
				
				}
				
				else
				{
					data = driver.findElement(By.xpath("//table[@id=\"product\" and @name=\"courses\"]/tbody/tr["+i+"]/td["+j+"]"));
					System.out.print(data.getText());
				
				}
			}
			
			System.out.println();
		}
		driver.quit();

	}

}
