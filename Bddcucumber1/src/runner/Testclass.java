package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="./src/feature",
	glue= {"stepdefinition"},                    // test class link feature class and stepdefinition class
	tags= {"@test1,@Regression"},
	dryRun=false , monochrome=true
)

public  class Testclass {

}
