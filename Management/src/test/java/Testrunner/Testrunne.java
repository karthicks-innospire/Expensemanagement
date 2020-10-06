package Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Feature", glue = {"Stepdef"}, monochrome = true, dryRun = false, plugin = {"pretty",
"html:target/cucumber-reports.html"},strict = true)
public class Testrunne extends AbstractTestNGCucumberTests {

}
