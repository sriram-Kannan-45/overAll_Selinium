package Synchronize;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DemoFlu {

	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://omayo.blogspot.com/");
		d.findElement(By.cssSelector(".dropbtn")).click();
		
		Wait<WebDriver> wait = new FluentWait<>(d).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchElementException.class);
		WebElement fb=wait.until(new Function<WebDriver, WebElement>() 
		
		{
			public WebElement apply(WebDriver d) {
				return d.findElement(By.linkText("Facebook"));
			}
		});
		
		fb.click();
	}

}
