package windowsAndFrames;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class DeomoQa {

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
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> newAllCount =  driver.getWindowHandles();
		
		System.out.println("current page : "+newAllCount.size());
		
		String parent = driver.getWindowHandle();
		
		System.out.println("parent window : "+parent);
		
		Iterator <String> iterator = newAllCount.iterator();
		
		String mainWindow = iterator.next();
		String childWindow = iterator.next();
		System.out.println("mainWindow "+mainWindow);
		System.out.println("childWindow "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		
		System.out.println("Child_titlt : "+text.getText());
		
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		System.out.println("parent title : "+driver.getTitle());
		
		driver.quit();

	}

}
