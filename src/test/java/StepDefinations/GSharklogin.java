/*
package StepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import PageObjectModel.faceboosignuppage;
import PageObjectModel.gymsharkloator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GSharklogin {
	
	WebDriver driver;
	@Given("user is in gymshark website")
	public void user_is_in_gymshark_website() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gymshark.com/");
		Thread.sleep(4000);
	}

	@When("user click the account button")
	public void user_click_the_account_button() throws InterruptedException, AWTException {
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_ESCAPE);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		gymsharkloator GS =new gymsharkloator(driver);
		GS.accountbtn().click();
		Thread.sleep(4000);
		
	}

	@When("user enter valid email {string}")
	public void user_enter_valid_email(String string) throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
		GS.email().sendKeys(string);
		Thread.sleep(2000);
	   	}

//	@When("user enter valid password {string}")
//	public void user_enter_valid_password(String string) throws InterruptedException {
//		gymsharkloator GS =new gymsharkloator(driver);
//	   GS.Password().sendKeys(string);
//	   Thread.sleep(2000);
//	}
	
	@When("user enter invalid password {string}")
	public void user_enter_invalid_password(String string) throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
		GS.Password().sendKeys(string);
		Thread.sleep(2000);
	}

	@When("user click the login button")
	public void user_click_the_login_button() throws InterruptedException  {
		gymsharkloator GS =new gymsharkloator(driver);
	   GS.loginbtn().click();
	   Thread.sleep(2000);
	 
	}
	
	
	@Then("user will not be able to log in")
	public void user_will_not_be_able_to_log_in() {
		gymsharkloator GS =new gymsharkloator(driver);
		SoftAssert sft=new SoftAssert();
		
		sft.assertEquals(GS.HomePageHeader().getText(),"MY GYMSHARK");
		System.out.println("First assertion passed");
		
	//	sft.assertTrue(GS.logbtn().isEnabled());
		sft.assertEquals(GS.error().getText(),"Wrong email or password.");
		System.out.println("Second assertion passed");
//


		sft.assertAll();

	}
	
//	@Then("user will be able to log in")
//	public void user_will_be_able_to_log_in() {
//	}

	
}
*/
