package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addToCart extends BaseClass
{

    @Given("user is on the Account page")
    public void user_is_on_the_account_page()
    {
        setupDriver();

        driver.get("https://tutorialsninja.com/demo/");

        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//span[text()='My Account']")))
                .click();

        wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText("Login")))
                .click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("input-email")))
                .sendKeys("2k22aids46@kiot.ac.in");

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("input-password")))
                .sendKeys("sriram123@");

        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//input[@value='Login']")))
                .click();
    }

    @Then("user searches for the items and adds to the cart and verifies the items in the cart")
    public void user_searches_for_the_items_and_adds_to_the_cart_and_verifies_the_items_in_the_cart(DataTable dataTable)
    {

        List<Map<String, String>> items =
                dataTable.asMaps(String.class, String.class);

        int i = 1;

        for (Map<String, String> item : items)
        {

            String productName = item.get("itemNameSearch");

            String expectedCartItem = item.get("itemNameCart");

            WebElement searchBox =
                    wait.until(ExpectedConditions
                            .visibilityOfElementLocated(By.name("search")));

            searchBox.clear();

            searchBox.sendKeys(productName, Keys.ENTER);

            List<WebElement> products =
                    wait.until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(
                                    By.xpath("//div[@class='product-thumb']")));

            for (int j = 0; j < products.size(); j++)
            {

                products =
                        wait.until(ExpectedConditions
                                .visibilityOfAllElementsLocatedBy(
                                        By.xpath("//div[@class='product-thumb']")));

                WebElement product = products.get(j);

                String actualProduct =
                        product.findElement(By.xpath(".//h4/a"))
                                .getText();

                if (actualProduct.equalsIgnoreCase(expectedCartItem))
                {

                    product.findElement(By.xpath(".//h4/a")).click();

                    wait.until(ExpectedConditions
                            .elementToBeClickable(By.id("button-cart")))
                            .click();

                    String actualMessage =
                            wait.until(ExpectedConditions
                                    .visibilityOfElementLocated(
                                            By.cssSelector(".alert-success")))
                                    .getText();

                    Assert.assertTrue(
                            actualMessage.contains(
                                    "Success: You have added " +
                                            expectedCartItem +
                                            " to your shopping cart!"
                            )
                    );

                    System.out.println(i++ + " : "
                            + expectedCartItem
                            + " Added Successfully");

                    driver.navigate().back();

                    break;
                }
                            
                
            }
        }
    }
}