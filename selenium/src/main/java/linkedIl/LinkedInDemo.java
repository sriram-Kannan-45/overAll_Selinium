package linkedIl;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class LinkedInDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String ex_name= "SRIRAM K";

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Ffeed%2F");
		
		WebElement firstName = driver.findElement(By.cssSelector("input#username"));
		firstName.sendKeys("wavene20@gmail.com");
		
		WebElement pass = driver.findElement(By.cssSelector("input#password"));
		pass.sendKeys("Titoo123@");
		
		WebElement login = driver.findElement(By.cssSelector("button[type$=mit]"));
		
		login.click();
		
		WebElement name = driver.findElement(By.cssSelector("._3d498c28._994ab483._215cc371._00d6c8f2.c404bb8a.d443cf91.d2a74372._18e3eda6._6e3e183c"));
		String crt_name = name.getText();
		
		if (crt_name.equals(ex_name))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Failed");
		}
//		System.out.println(title);
//		
		driver.quit();
	}

}
