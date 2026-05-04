package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
	    plugin = {"pretty", "html:target/cucumber-reports/Cucumber3.html"},
	    features = "src/test/resources/fetureFiles/login.feature",
	    glue = "stepdefinition" , tags = ("not @sriram")
	)
public class JuintRunner  

{

}
