package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.faceboosignuppage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Facebooksignup {

	WebDriver driver;
	@Given("user is in facebook signup page")
	public void user_is_in_facebook_signup_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(3000);
	}
	@When("user enter firstname {string} and last name {string}")
	public void user_enter_firstname_and_last_name(String FirstName, String LastName) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.firstname().sendKeys(FirstName);
		FBpage.Lastname().sendKeys(LastName);
		Thread.sleep(3000);
	}

	@And("user enter Phone number {string}")
	public void user_enter_phone_number(String string) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.PhnNumberOrEmail().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user enter Password {string}")
	public void user_enter_password(String string) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.Password().sendKeys(string);
		Thread.sleep(3000);
	    
	}
	
	@When("user select date of birth {string} and {string} and {string}")
	public void user_select_date_of_birth_and_and(String Month, String Day, String Year) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		Select selMonth=new Select(FBpage.Month());
		selMonth.selectByValue(Month);
        
		Select selDay= new Select (FBpage.Day());
		selDay.selectByValue(Day);
		
		Select selYear = new Select (FBpage.Year());
		selYear.selectByValue(Year);
		Thread.sleep(3000);
	}
	
	@When("user select gender {string}")
	public void user_select_gender(String string) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.Male().click();
		Thread.sleep(3000);
	}


	@And("user click signup button")
	public void user_click_signup_button() throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.btnSignUp().click();
		Thread.sleep(5000);
		driver.close();
	}

	@Then("user able to signup")
	public void user_able_to_signup() {
	    
	}
	
//	@Then("user not able to signup")
	//public void user_not_able_to_signup() {


}


