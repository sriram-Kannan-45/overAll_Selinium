package autoIt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pdf2docsAutoit 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://pdf2doc.com/");

		WebElement file = driver.findElement(By.xpath("//span[text()='UPLOAD FILES']"));

		file.click();

		
		Thread.sleep(3000);

		Robot rb = new Robot();

		StringSelection str = new StringSelection(
				"C:\\Users\\user\\Downloads\\PROJECT_REPORT(FINAL_YEAR).pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Download']"))).click();
		
		
	}
}