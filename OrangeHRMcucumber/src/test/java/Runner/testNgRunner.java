package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"pretty","html:target/cucucmber-reports/Cucumber.html"},
features="src/test/resources/com/feature/OHRMlogin.feature", tags = "@invalidCredentials"
		+ "",
glue="com/stepdefinitions")

public class testNgRunner extends AbstractTestNGCucumberTests

{

}
