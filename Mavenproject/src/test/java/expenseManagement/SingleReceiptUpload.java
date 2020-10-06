package expenseManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SingleReceiptUpload {
	
	WebDriver driver;
	
	@Given("launched url {string}")
	
	public void launched_url (String url) throws InterruptedException {
		
		
    WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).sendKeys("rdurai@innospire.com");
	
	driver.findElement(By.id("ContentPlaceHolder1_txtpassword")).sendKeys("1234");
	

	
	driver.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
	
	}
	
	@When("the user clicks on add symbol button on the expense list")
	
	public void the_user_clicks_on_add_symbol_button_on_the_expense_list() {
		
	
		
	driver.findElement(By.className("isc-theme-blue-btn")).click();
		
		
	}
	
	
	@Then("the user fills in the Fields like expense name and amount in expense upload page {string} {string}")
	
	public void the_user_fills_in_the_fields_like_expense_name_and_amount_in_expense_upload_page(String Expensename, String Advanceamount) {
		
		
		
		driver.findElement(By.id("txt_ExpenseName")).sendKeys(Expensename);
		
		driver.findElement(By.id("txt_advance")).sendKeys(Advanceamount);
	
		}
	
	
	
	

	@And("the user Selects the particular receipt to upload")
	
	public void the_user_selects_the_particular_receipt_to_upload() {

	   
	driver.findElement(By.xpath("(//a[@data-toggle= 'dropdown'] )[2]")).click();
	       
	driver.findElement(By.xpath("(//a[@data-toggle= 'modal'] )[1]")).click();
	       
	   }

	@And("the user selects browse option to upload expense receipt")
	
	public void the_user_selects_browse_option_to_upload_expense_receipt() {
		
	driver.findElement(By.xpath("(//input[@type='file'] )[1]")).sendKeys("C:\\Users\\brajkumar\\Desktop\\expense management\\ISC EB Bill July20.pdf");
	driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	}

	
	@And("user clicks on okay button, expenses details must be updated and the New expenses must be displayed.")
	public void user_clicks_on_okay_button_expenses_details_must_be_updated_and_the_new_expenses_must_be_displayed() {
		
		driver.findElement(By.id("add-reciept")).click();
	}
	
	@Then("the user selects Drag&drop option to upload expense receipt")
	
	public void the_user_selects_drag_drop_option_to_upload_expense_receipt() {
		
		
		
		
		
		
}

}	

