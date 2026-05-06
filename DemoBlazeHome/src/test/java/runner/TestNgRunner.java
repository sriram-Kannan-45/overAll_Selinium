package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"pretty","html:target/cucucmber-reports/Cucumber.html"},
features="D:/selenium/DemoBlazeHome/src/test/resources/com/features/login.feature",tags=("@validCredentialsLogin"),
glue="stepDefinition")

public class TestNgRunner extends AbstractTestNGCucumberTests{

}
