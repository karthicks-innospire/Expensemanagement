package testRunner;





import cucumber.api.CucumberOptions;




@CucumberOptions(
		
		features = {"Mavenproject/feature/Expense.feature"},
		
	      glue = {"SingleReceiptUpload"},
		
		dryRun = false
		
		)
		
public class TestRunner {

}