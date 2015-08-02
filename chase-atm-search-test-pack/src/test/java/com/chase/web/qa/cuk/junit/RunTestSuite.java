package com.chase.web.qa.cuk.junit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", 
		glue = "com.chase.web.qa.cuk.stepdefs", 
		plugin = {"html:target/report"}
)
public class RunTestSuite {

}
