package com.freeCrm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
		//plugin = {"json:target/cucumber.json"},
		plugin = {"pretty","html:test-output"},
		features = "C:\\Users\\KIMURUGA\\eclipse-workspace\\com.free_crm_1\\src\\test\\resources\\CRM_features"
		,glue={"com.freeCrm.steps.definitions"}
		,tags= {"@contactpage"}
		)

public class FreeCrmRunner  {

	}


