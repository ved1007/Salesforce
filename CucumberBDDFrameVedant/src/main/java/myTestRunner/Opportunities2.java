package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/vedant.jagani/git/Salesforce/CucumberBDDFrameVedant/src/main/java/Features/Opportunities2.feature",

        glue = {"stepDefinitions2" }, 
        format = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" },
		monochrome = true,
		strict = true,
		dryRun = false
//      tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
	//	plugin= {"pretty", "html:test-output"}
)

public class Opportunities2 {

}