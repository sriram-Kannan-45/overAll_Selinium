package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest 

{
	
	WebDriver driver ;
	
	@Before
	public void setup()
	{
		System.out.println("---------before-------------");
		
		ChromeOptions chromeoptions = new ChromeOptions();
		
		chromeoptions.addArguments("--start-maximized");
		
		driver = new ChromeDriver(chromeoptions);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
	}
	
	@Given("User is on Home Page with the url {string}")
	public void user_is_on_home_page_with_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	     
	    driver.get(string);
	}

	@Given("user can clik  login button")
	public void user_can_clik_login_button() 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
	}

	@When("User enters valid username as {string}")
	public void user_enters_valid_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("loginusername")).sendKeys(string);
	   
	}

	@When("User enters valid password as {string}")
	public void user_enters_valid_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("loginpassword")).sendKeys(string);
	}

	@When("User can click the Login button")
	public void user_can_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
	}

	@Then("User should be able to see to Welcome admin message")
	public void user_should_be_able_to_see_to_welcome_admin_message() {
	    // Write code here that turns the phrase above into concrete actions
	    String expect = "Welcome admin";
	    
	    String actual = driver.findElement(By.xpath("//a[text()=\"Welcome admin\"]")).getText();
	    
	    Assert.assertEquals(actual, expect);
	    
	   
	}
	
	@After
	public void close()
	{
		System.out.println("---------after----------");
		
		driver.quit();
	}




}
