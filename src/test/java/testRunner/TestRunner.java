package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/sarda/workspace/developer/com.tek.automation/src/test/resources/feature"},
		glue = {"stepDefinition"},
		plugin = { "pretty", "html:target/cucumber-reports" },
		tags = {"@smoke"},
		dryRun = false,
		monochrome = true
		)

public class TestRunner {

}
