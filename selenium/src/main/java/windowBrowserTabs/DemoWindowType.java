package windowBrowserTabs;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//WindowType.WINDOW
public class DemoWindowType {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/browser-windows");
		
		
		
		String parentHandle = driver.getWindowHandle();
		
		System.out.println(parentHandle);
		
		Set<String> allCount =  driver.getWindowHandles();
		
		System.out.println("main page : "+allCount.size());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://demoqa.com/sample");
		
		String sample = driver.findElement(By.cssSelector("h1")).getText();
		
		System.out.println(sample);

	}

}
