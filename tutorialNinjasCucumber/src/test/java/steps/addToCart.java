package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addToCart extends LoginTest

{
	@Given("user is on the Account page")
	public void user_is_on_the_account_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    login();
	}

	@When("user searche {string} in a search box")
	public void user_searche_in_a_search_box(String string)
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search"))).sendKeys(string);
	}

	@When("the user clicks on the {string} from the search results")
	public void the_user_clicks_on_the_from_the_search_results(String string) 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	       wait.until(ExpectedConditions.elementToBeClickable(By.linkText(string))).click();
	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the {string} should be see in the cart")
	public void the_should_be_see_in_the_cart(String string) 
	
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
