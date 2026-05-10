package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/com/feature/cart.feature",

        glue = { "steps" },

        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"
        } ,
        
        tags =  "@cart"
)

public class runnerTestNg extends AbstractTestNGCucumberTests
{

}