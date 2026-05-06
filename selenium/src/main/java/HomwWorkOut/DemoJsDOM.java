package HomwWorkOut;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class DemoJsDOM 
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector(\"input[maxlength='10']\").value='sriram';");
        String f_name = (String) js.executeScript("return document.querySelector(\"input[maxlength='10']\").value;");
        System.out.println(f_name);

        js.executeScript("document.querySelector(\"input[maxlength='15']\").value='kannan';");
        String l_name = (String) js.executeScript("return document.querySelector(\"input[maxlength='15']\").value;");
        System.out.println(l_name);

        js.executeScript("document.querySelector(\"input[required][type='text']\").value='sriram123@gmail.com';");
        String email = (String) js.executeScript("return document.querySelector(\"input[required][type='text']\").value;");
        System.out.println(email);

        js.executeScript("document.querySelectorAll(\"input[type='password']\")[0].value='sriram123';");
        String password = (String) js.executeScript("return document.querySelectorAll(\"input[type='password']\")[0].value;");
        System.out.println(password);

        js.executeScript("document.querySelectorAll(\"input[type='password']\")[1].value='sriram123';");
        String confirm_password = (String) js.executeScript("return document.querySelectorAll(\"input[type='password']\")[1].value;");
        System.out.println(confirm_password);

        js.executeScript("document.querySelector('button[type=\"submit\"]').click();");

        String currentUrl = (String) js.executeScript("return document.URL;");

        if (currentUrl.equals("https://www.hyrtutorials.com/p/add-padding-to-containers.html?name=sriram&name=kannan")) {
            System.out.println("Form submitted successfully");
        } else {
            System.out.println("Form submission failed");
        }
        
        driver.quit();
    }
}