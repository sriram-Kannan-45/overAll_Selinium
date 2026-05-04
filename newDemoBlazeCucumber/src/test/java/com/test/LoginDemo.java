package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.LoginPageDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo 
{
	LoginPageDemo loginObject ;
	
	WebDriver driver ;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}
	@Given("User is on Home Page with the url {string}")
	public void user_is_on_home_page_with_the_url(String string)
	{
	    // Write code here that turns the phrase above into concrete actions
	     driver.get(string);
	     
	     loginObject = new LoginPageDemo (driver);
	}

	
	@Given("user can clik  login button")
	public void user_can_clik_login_button() 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    loginObject.getLoginBtn1();
	}

	@When("User enters valid username as {string}")
	public void user_enters_valid_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    loginObject.setUsername(string);
	}

	@When("User enters valid password as {string}")
	public void user_enters_valid_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    loginObject.setUserPass(string);
	}

	@When("User can click the Login button")
	public void user_can_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    loginObject.getLoginBtn();
	}

	@Then("User should be able to see to Welcome admin message")
	public void user_should_be_able_to_see_to_welcome_admin_message() {
	    // Write code here that turns the phrase above into concrete actions
		loginObject.asserLogin();
	}

	@After
	public void close()
	{
		
		driver.quit();
	}
}
