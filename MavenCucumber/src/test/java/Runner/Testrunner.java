package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="Login\\Login.feature",
glue="StepDefinition",
tags = "@Positivetesting",
monochrome=true,//this is to make the console output in a better format
dryRun=false,//tocheck all methods are implemented
strict=true// to check did I miss anything
//tags = "Positivetesting"
		)
public class Testrunner {

}
