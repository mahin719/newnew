package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMILocator {
public WebDriver driver;
	
	public BMILocator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	@FindBy(xpath="//input[@name=\"heightFt\"]")
	WebElement Hfeet;
	public WebElement Hfeet() {
		return Hfeet;
	}
	
	@FindBy(xpath="//input[@name=\"heightInch\"]")
	WebElement Hinch;
	public WebElement Hinch() {
		return Hinch;
	}
	
	@FindBy(xpath="//input[@name=\"weightLbs\"]")
	WebElement Wlb;
	public WebElement Wlb() {
		return Wlb;
	}
	
	@FindBy(xpath="//button[@class=\"webmd-button webmd-button--primary webmd-button--medium bc-calc-btn active\"]")
	WebElement Calbtn;
	public WebElement Calbtn() {
		return Calbtn;
	}
	
	@FindBy(xpath="//div[@class=\"title\" and contains(text(),'Your BMI Result') ]")
	WebElement YBR;
	public WebElement YBR() {
		return YBR;
	}
	
		@FindBy(xpath="//span[@class=\"result-card-left-second-number\"]")
		WebElement result;
		public WebElement result() {
			return result;	
	}
}
