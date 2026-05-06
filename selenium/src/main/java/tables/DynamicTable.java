package tables;
//2k22aids46@kiot.ac.in sriram123@

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement user = driver.findElement(By.cssSelector("input#email"));
		user.sendKeys("2k22aids46@kiot.ac.in");

		WebElement user1 = driver.findElement(By.cssSelector("input#password"));
		user1.sendKeys("sriram123@");

		WebElement submit = driver.findElement(By.cssSelector("button#submit"));
		submit.click();

		List<WebElement> tabler = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));
		int r = tabler.size();
		System.out.println("Total contacts: " + r);
		
		for (WebElement i : tabler) {
			System.out.println(i.getText());
		}
		int i = 1;
		for (WebElement j : tabler) 
		{
			if (j.getText().equals("ramanan v") || j.getText().equals("aravinth kumar")) 
			{
				List<WebElement> actual = driver.findElements(By.xpath("//table[@id='myTable']//tr[" + i + "]"));
				for (WebElement row : actual) 
				{
					System.out.println(row.getText());
				}

			}
			i++;
		}
	}

}