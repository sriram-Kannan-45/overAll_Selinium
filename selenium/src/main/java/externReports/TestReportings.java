package externReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestReportings 

{

	public static void main(String args[])
	
	{
		
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extentReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		WebDriver driver = new ChromeDriver();
		
		ExtentTest test = extent.createTest("google search test");
		
		try 
		{
			driver.get("nn");
			test.pass("Navigated to google");
		}
		
		catch(Exception e)
		{
			test.fail("test fail"+ e.getMessage());
		}
		
		finally
		{
			driver.quit();
			extent.flush();
		}
	}
}
