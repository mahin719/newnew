/*
package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gymsharkloator {
	
	public WebDriver driver;
	
	public gymsharkloator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(@href, 'https://www.gymshark.com/account') and (@title=\"account\") and (@aria-label=\"View your account\")]")
	WebElement accountbtn;
	public WebElement accountbtn() {
		return accountbtn;
	}
	
	@FindBy(id="login-email")
	WebElement email;
	public WebElement email() {
		return email;
	}
	
	@FindBy(id="current-password")
	WebElement Password;
	public WebElement Password() {
		return Password;
	}
	
	

//	@FindBy(id="toggle-label")
//	WebElement logbtn;
//	public WebElement logbtn() {
//		return logbtn;
//	}
	
	
	@FindBy(id="btn-login")
	WebElement loginbtn;
	public WebElement loginbtn() {
		return loginbtn;
		
	}
	
	@FindBy(xpath="//h1[@class=\"font-heading font-bold text-xl my-6 uppercase\"]")
	WebElement HomePageHeader;
	public WebElement HomePageHeader() {
		return HomePageHeader;
		
	}
	
	@FindBy(xpath="//div[@class=\"text-error text-xs mt-1\"]")
	WebElement error;
	public WebElement error() {
		return error;
	}

}

*/
