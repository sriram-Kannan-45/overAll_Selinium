package taskProductDemo;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.findElement(By.id("login2")).click();

       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));

        driver.findElement(By.id("loginusername")).sendKeys("admin");
        driver.findElement(By.id("loginpassword")).sendKeys("admin");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

       
        WebElement wel = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))
        );

        String expected = "Welcome admin";
        String actual = wel.getText();

        System.out.println(actual);

        if (expected.equals(actual)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        driver.quit();
    }
}