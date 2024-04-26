/*
package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import PageObjectModel.lumalocator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class lumademovalidation {
	
	WebDriver driver;
	
	@Given("user is in Luma website")
	public void user_is_in_luma_website() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		
		driver.get("https://magento.softwaretestingboard.com/");
	   
	}

	@When("user user click the sign in button")
	public void user_user_click_the_sign_in_button() {
		lumalocator luma = new lumalocator(driver);
		luma.accountbtn().click();   
	}

	@When("user enter valid email {string}")
	public void user_enter_valid_email(String string) throws InterruptedException {
		lumalocator luma = new lumalocator(driver);
		luma.email().sendKeys(string);
		
		Thread.sleep(2000);
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String string) throws InterruptedException {
		lumalocator luma = new lumalocator(driver);
		luma.Password().sendKeys(string);
		
		Thread.sleep(2000);
	}

	@When("user click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		lumalocator luma = new lumalocator(driver);
		luma.loginbtn().click();
		
		Thread.sleep(6000);
	}

	@Then("user will be able to login")
	public void user_will_be_able_to_login() {
		lumalocator luma = new lumalocator(driver);
		
		SoftAssert sft=new SoftAssert();
		
		sft.assertEquals(luma.HomePageHeader().getText(), "Welcome, amar nam!");
		System.out.println("First assertion passed");
		
		sft.assertAll();
		
		driver.close();
	}

}
*/
