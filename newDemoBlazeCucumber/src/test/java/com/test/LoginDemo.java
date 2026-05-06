package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.LoginPageDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginDemo {

    WebDriver driver;
    LoginPageDemo page;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new LoginPageDemo(driver);
    }

    @Before("@CategoryTest")
    public void loginBeforeCategory() {
        driver.get("https://www.demoblaze.com/");
        page.login("admin", "admin");
    }

    @Given("User is on Home Page with the url {string}")
    public void user_is_on_home_page(String url) {
        driver.get(url);
    }

    @When("User enters valid username as {string}")
    public void enter_username(String user) {
        page.login(user, "admin");
    }

    @When("User enters valid password as {string}")
    public void enter_password(String pass) {
    }

    @When("User can click the Login button")
    public void click_login() {
    }

    @Then("User should be able to see to Welcome admin message")
    public void verify_login() {
        page.verifyLogin();
    }

    @Given("User is on the Demoblaze Products store")
    public void user_on_store() {
        driver.get("https://www.demoblaze.com/");
    }

    @When("User clicks on Phones")
    public void click_phones() {
        page.clickPhones();
    }

    @Then("User should see Samsung galaxy s6")
    public void verify_phone() {
        page.verifySamsung();
    }

    @After
    public void teardown() {
//        driver.quit();
    }
}