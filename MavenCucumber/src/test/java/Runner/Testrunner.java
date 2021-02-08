package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="eLearning\\Login.feature",
glue="StepDefinition",
//tags = "@Email",
monochrome=true,//this is to make the console output in a better format
dryRun=false,//to check all methods are implemented
strict=true,// to check did I miss anything
plugin = {"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
		)
public class Testrunner {

}
