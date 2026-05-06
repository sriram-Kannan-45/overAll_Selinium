package com.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageDemo {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPageDemo(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By loginLink = By.id("login2");
    By userName = By.id("loginusername");
    By userPass = By.id("loginpassword");
    By loginBtn = By.xpath("//button[text()='Log in']");
    By welcome = By.id("nameofuser");

    By phones = By.linkText("Phones");
    By samsung = By.linkText("Samsung galaxy s6");

    public void login(String user, String pass) {
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(user);
        driver.findElement(userPass).sendKeys(pass);
        driver.findElement(loginBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcome));
    }

    public void verifyLogin() {
        String text = driver.findElement(welcome).getText();
        Assert.assertTrue(text.contains("Welcome"));
    }

    public void clickPhones() {
        wait.until(ExpectedConditions.elementToBeClickable(phones)).click();
    }

    public void verifySamsung() {
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(samsung)).getText();
        Assert.assertEquals(actual, "Samsung galaxy s6");
    }
}