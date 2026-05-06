package windowsAndFrames;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaFrames {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		WebElement frame_1 = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(frame_1);
		
		String strFrame1 = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println("success frame 1 : "+strFrame1);
		
		driver.switchTo().defaultContent();
		
		String mainPage = driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
		
		System.out.println(mainPage);
		
		driver.switchTo().frame(1);
		
		String frame_2 = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println("success frame 2 :"+frame_2);
		
		driver.quit();
		
		}

}
