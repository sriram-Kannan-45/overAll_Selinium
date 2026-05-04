package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
	    plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"},
	    features = "src/test/resources/fetureFiles/login.feature",
	    glue = "stepdefinition"
	)
	
public class TestNgRunner extends AbstractTestNGCucumberTests

{

	
}
