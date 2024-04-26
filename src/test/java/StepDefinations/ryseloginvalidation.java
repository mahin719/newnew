/*
package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.rysefuellocator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ryseloginvalidation {
	
	WebDriver driver;
	@Given("user is in rysefuel website")
	public void user_is_in_rysefuel_website() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rysesupps.com/collections/ryse-fuel-energy-drink");
	   
	}

	@When("user user click the account button")
	public void user_user_click_the_account_button() {
		rysefuellocator RF = new rysefuellocator(driver);
		RF.accountbtn().click();
	   
	}

	@When("user enter valid email {string}")
	public void user_enter_valid_email(String string) {
		rysefuellocator RF = new rysefuellocator(driver);
		RF.email().sendKeys(string);
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String string) {
		rysefuellocator RF = new rysefuellocator(driver);
		RF.Password().sendKeys(string);
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		rysefuellocator RF = new rysefuellocator(driver);
		RF.loginbtn().click();
	}

	@Then("user will be able to login")
	public void user_will_be_able_to_login() {
	   
	}

}
*/

