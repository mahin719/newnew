
package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import PageObjectModel.BMILocator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class BMIcalc {
	
	WebDriver driver;
	
	@Given("user is in webmd BMI calculator website")
	public void user_is_in_webmd_bmi_calculator_website() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		long time= 5;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	    
		driver.get("https://www.webmd.com/diet/body-bmi-calculator");
	}

	@When("user enter height in feet {string} and inches {string}")
	public void user_enter_height_in_feet_and_inches(String string1, String string2) throws InterruptedException {
		
		BMILocator BMI = new BMILocator(driver);
	    BMI.Hfeet().sendKeys(string1);
	    BMI.Hinch().sendKeys(string2);
	    
	    Thread.sleep(2000);
	}

	@When("user enter weight in pounds {string}")
	public void user_enter_weight_in_pounds(String string) {
	   
		BMILocator BMI = new BMILocator(driver);
		BMI.Wlb().sendKeys(string);
	}

	@When("user click calculate button")
	public void user_click_calculate_button() throws InterruptedException {
	 
		BMILocator BMI = new BMILocator(driver);
		BMI.Calbtn().click();
		
		Thread.sleep(3000);
	}

	@Then("user will be able to see the BMI number {string}")
	public void user_will_be_able_to_see_the_bmi_number(String Result) {
	  
		BMILocator BMI = new BMILocator(driver);
		
		SoftAssert sf=new SoftAssert();
	//sf.assertEquals(BMI.result().getAttribute(Result), Result);
		sf.assertEquals(BMI.result().getText(), Result);
//		sf.assertEquals(BMI.YBR().getText(),"Your BMI Result");
//		System.out.println("soft assertion passed");
       sf.assertAll();
        
        
	}
    
	
}


