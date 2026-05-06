package com.newTest;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.utilities.DriverManager;

import org.testng.annotations.Listeners;
import com.listeners.TestListener;

@Listeners(TestListener.class)
public class demoBlaze {

    private static final Logger log = LogManager.getLogger(demoBlaze.class);

    @BeforeMethod
    public void setup() {
        try {
            log.debug("Starting browser");

            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver); 

        } catch (Exception e) {
            log.error("Error while launching browser", e);
            throw e;
        }
    }

    @Test
    public void loginCheck() {

        try {
            WebDriver driver = DriverManager.getDriver();

            log.info("Login test started");

            driver.manage().window().maximize();
            driver.get("https://www.demoblaze.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            driver.findElement(By.id("login2")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")))
                    .sendKeys("admin");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")))
                    .sendKeys("admin");

            driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();

            WebElement user = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("nameofuse")) 
            );

            log.info("User text: " + user.getText());

            Assert.assertTrue(user.getText().contains("Welcome"));

        } catch (Exception e) {
            log.error("Test failed", e);
            Assert.fail("Test failed: " + e.getMessage());
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        WebDriver driver = DriverManager.getDriver();

        if (driver != null) {
            driver.quit();
            log.debug("Browser closed");
        }

        DriverManager.removeDriver(); 
    }
}