package com.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	WebDriver driver;

	WebDriverWait wait;

	@Given("user is on Home page")
	public void user_is_on_home_page()

	{
		// Write code here that turns the phrase above into concrete actions

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@When("user enters username as <{string}> and password as <{string}>")
	public void user_enters_username_as_and_password_as(String string, String string2)

	{
		// Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")))
				.sendKeys(string);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]")))
				.sendKeys(string2);
	}

	@When("user clicks login Button")
	public void user_clicks_login_button()

	{
		// Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]"))).click();

	}

	@When("user enters valid credetials")
	public void user_enters_valid_credetials(DataTable dataTable)

	{
		System.out.println("credentials");

		List<List<String>> signUpForm = dataTable.asLists(String.class);

		String userName = signUpForm.get(0).get(0);

		String passWord = signUpForm.get(0).get(1);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")))
				.sendKeys(userName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]")))
				.sendKeys(passWord);

		
	}
	
	@Then("user enters invlaid credentials and login will be unsuccessfull with")
	public void user_enters_invlaid_credentials_and_login_will_be_unsuccessfull_with(DataTable dataTable) 
	
	{
	
		List<Map<String, String>> user = dataTable.asMaps(String.class , String.class);
		
		for (Map <String , String > form : user )
		{
			userName = form.get("Username");
		}
	}

	@Then("user should be able to login successfully and new page open")
	public void user_should_be_able_to_login_successfully_and_new_page_open() {
		// Write code here that turns the phrase above into concrete actions
		String actual = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()=\"Dashboard\"]"))).getText();

		Assert.assertEquals(actual, "Dashboard");

	}

	@Then("user should be able to see an <{string}>")
	public void user_should_be_able_to_see_an(String string)

	{
		if (string.equals("Invalid credentials")) {
			String actual = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"Invalid credentials\"]")))
					.getText();

			Assert.assertEquals(actual, string);
		}

		else if (string.equals("Required"))

		{
			if (wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//input[@name=\\\"username\\\"]/following::span")))
					.equals(string)) {
				String actual = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//input[@name=\\\"username\\\"]/following::span")))
						.getText();

				Assert.assertEquals(actual, string);
			}

			else if (wait
					.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]/following::span")))
					.equals(string)) {
				String actual = wait
						.until(ExpectedConditions
								.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]/following::span")))
						.getText();

				Assert.assertEquals(actual, string);

			}
		}

	}

}
