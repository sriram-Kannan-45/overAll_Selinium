package Demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class interaNetHello {
	WebDriver driver ;
	WebDriverWait wait ;
	
	SoftAssert soft = new SoftAssert();
	
	
  @Test
  public void DynamicLoad()
  {
	  
	    driver.navigate().to("https://the-internet.herokuapp.com/");
		
	    WebElement dynamicLoading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[text()=\"Dynamic Loading\"]")));
		
		dynamicLoading.click();
		
		WebElement dyanmic_1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),\"Example 1\")]")));
		
		dyanmic_1.click();
		
		WebElement start = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()=\"Start\"]")));
		
		start.click();
		
		String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/child::h4[text()=\"Hello World!\"]"))).getText();
		
		String expect = "Hello World!";
		
		Assert.assertEquals(actual, expect,"name not same");
		
		System.out.println(actual+" printed successfuly..");
  }
  
  @Test
  
  public void dropDown()
  {
	    driver.navigate().to("https://the-internet.herokuapp.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Dropdown\"]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select"))).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//select/option"));
		
		String actual = "Option 2";
		String expect = "";
		
		for (WebElement option : list)
		{
			if (option.getText().equals("Option 2"))
			{
				expect = option.getText();
				
				option.click();
			}
		}
		
		soft.assertEquals( actual , expect );
		
		System.out.println("Drop Down");
		
		soft.assertAll();
  }
  @Test
  
  public void dynamicControl()
  {
	  	driver.navigate().to("https://the-internet.herokuapp.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Dynamic Controls\"]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"checkbox\"]/input"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Remove\"]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"It's gone!\"]"))).getText();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Enable\"]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id=\"input-example\"]/input"))).sendKeys("Hi");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Disable\"]"))).click();
		
		String expect = "Enable";
		
		String actual =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Enable\"]"))).getText();
		
		soft.assertEquals(expect, actual,"its disable");
		
		System.out.println("Enabled");
		
		soft.assertAll();
		
  }
  @BeforeTest
  public void beforeTest()
  {
	  	ChromeOptions option = new ChromeOptions();
	  	
	  	option.addArguments("--headless");
	  	
	  	driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

  }
  @Test
  
  public void Alert()
  {
	    driver.navigate().to("https://the-internet.herokuapp.com/");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"JavaScript Alerts\"]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Click for JS Alert\"]"))).click();
		
		Alert alt = driver.switchTo().alert();
		
		String actual ="I am a JS Alert";
		String expect = alt.getText();
		
		alt.accept();
		
		soft.assertEquals(expect, actual);
		
		System.out.println("I am a JS Alert");
		
		
  }
  @AfterTest
  public void afterTest() 
  
  {
	      
  }

}
