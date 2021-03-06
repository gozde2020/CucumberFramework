package com.hrms.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", //need to give a path for our feature files
				 glue = "com/hrms/ReviewAPI",// we need to glue our step definitions - implementation 
				 dryRun = false, //when set as true, will run over the feature steps and identify the missing implementation //not run-when true	 
				 monochrome = true, // when set as true, will format the console outcome like 32m15 32m3
				 //@feature in en ustune koyasark hepsini run eder
				 tags = "@APIReview", //Login.feature in           icindeki scenario' ya @smoke ekliyoruz.
				 strict = false, // when set as true, will fail the execution when undefined step is found //it runs	
				 plugin = {"pretty", // will print the steps inside the console
						 "html:target/cucumber-default-reports", // generates default html report 
						 "rerun:target/FailedTests.txt", // generates a txt file only with failed tests
				 "json:target/cucumber.json" // generates json reports 
} 
					)
public class ReviewAPIRunner {

}
