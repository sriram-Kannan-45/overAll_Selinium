package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest 


{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void login() 
	
	{
		// Set up WebDriver and WebDriverWait here
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("2k22aids46@kiot.ac.in");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("sriram123@");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']"))).click();
		
		String expectedTitle = "My Account";
		
		String actualTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='My Account']"))).getText();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
	}
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() 
	
	{
	    driver  = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	   
	    driver.get("https://tutorialsninja.com/demo/");
	    
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    
	}

	@When("the user clicks on the My Account dropdown")
	public void the_user_clicks_on_the_my_account_dropdown() 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']"))).click();
	}

	@When("the user clicks on the Login option")
	public void the_user_clicks_on_the_login_option() 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();
	    
	    
	}

	@When("the user enters the {string} and {string}")
	public void the_user_enters_the_and(String string, String string2) 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys(string);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password"))).sendKeys(string2);
	    
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']"))).click();
	}

	@Then("the user should be seen the My Account page")
	public void the_user_should_be_seen_the_my_account_page() 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    String expectedTitle = "My Account";
	    
	    String actualTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='My Account']"))).getText();
	    
	    Assert.assertEquals(actualTitle, expectedTitle);
	    
	}


}
