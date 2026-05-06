package HomwWorkOut;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/buttons");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions act = new Actions(driver);

        // ✅ Double Click
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(doubleClick).build().perform();

        // ✅ Right Click
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightClick).perform();

        // ✅ Normal Click (Dynamic button)
        WebElement dynamicClick = driver.findElement(
            By.xpath("//button[text()='Click Me']")
        );
        dynamicClick.click();

    }
}
