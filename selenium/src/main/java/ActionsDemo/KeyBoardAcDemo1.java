package ActionsDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAcDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		Actions act = new Actions (driver);
		
		WebElement comp = driver.findElement(By.linkText("compendiumdev"));
		
		act.keyDown(Keys.CONTROL).moveToElement(comp).click().keyUp(Keys.CONTROL).build().perform();
		
		Set<String> windowhandles =  driver.getWindowHandles();
		
		String parent = driver.getWindowHandle();
		for(String handles : windowhandles)
		{
			driver.switchTo().window(handles);
		}
		
		Thread.sleep(3000);
		
		System.out.println("Child window : "+windowhandles);
		
		driver.switchTo().window(parent);
	}

}
