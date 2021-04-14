package com.mindtree.Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(features= {"features"},glue={"com.mindtree.StepDefinition"},strict = false,
	plugin= {"pretty","json:Reports/BDD-Report/results.json","html:target/cucumber","json:target/cucumber/cucumber/json"},
	tags= {},monochrome=true,dryRun=false)
public class Runner {
	
}
