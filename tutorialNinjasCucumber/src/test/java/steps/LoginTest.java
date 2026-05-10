package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseClass
{

    @Before
    public void login()
    {
        setupDriver();

        driver.get("https://tutorialsninja.com/demo/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")))
                .sendKeys("2k22aids46@kiot.ac.in");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")))
                .sendKeys("sriram123@");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")))
                .click();

        String expectedTitle = "My Account";

        String actualTitle = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h2[text()='My Account']")))
                .getText();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage()
    {
        setupDriver();

        driver.get("https://tutorialsninja.com/demo/");
    }

    @When("the user clicks on the My Account dropdown")
    public void the_user_clicks_on_the_my_account_dropdown()
    {
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//span[text()='My Account']")))
                .click();
    }

    @When("the user clicks on the Login option")
    public void the_user_clicks_on_the_login_option()
    {
        wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText("Login")))
                .click();
    }

    @When("the user enters the {string} and {string}")
    public void the_user_enters_the_and(String email, String password)
    {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("input-email")))
                .sendKeys(email);

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("input-password")))
                .sendKeys(password);
    }

    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button()
    {
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//input[@value='Login']")))
                .click();
    }

    @Then("the user should be seen the My Account page")
    public void the_user_should_be_seen_the_my_account_page()
    {
        String expectedTitle = "My Account";

        String actualTitle = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h2[text()='My Account']")))
                .getText();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}