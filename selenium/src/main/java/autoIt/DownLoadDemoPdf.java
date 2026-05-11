package autoIt;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownLoadDemoPdf {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		
		String down_path = System.getProperty("user.dir")+File.separator+"downloads";
		
		ChromeOptions options = new ChromeOptions();
		
		Map<String , Object > prefs = new HashMap<>();
		
		prefs.put("plugins.always_open_directory", true);
		
		prefs.put("download.default_directory", down_path);
		
		options.setExperimentalOption("prefs", prefs);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html?utm_source=chatgpt.com");
		
		WebElement downLink = driver.findElement(By.xpath("//div[@style=\"text-align: center;\"]/a[text()=\"Download\"]"));
		
		downLink.click();
		
		Thread.sleep(5000);
		
		File downFile = new File(down_path + "/samplefile.pdf");
		
		if (downFile.exists())
		{
			System.out.println("File is downLoaded!!");
		}
		
		else
		{
			System.out.println("File is not downLoaded!!");
		}
		

	}

}
