package com.CallRail_Test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src/test/resources/feature", 
					glue = "com.sprintqa.stepDef", 
					monochrome = true,
					tags="@ted",
					plugin = {"json:target/cucumber.json"}
				)
public class Runner {

}