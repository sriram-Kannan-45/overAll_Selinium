package Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/com/feature", glue = { "steps" }, plugin = { "pretty",
		"html:target/cucumber-reports.html" }, tags = "@loginValid")
public class runnerTestNg 

{

}
