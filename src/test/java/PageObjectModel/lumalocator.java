/*
package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lumalocator {
	
public WebDriver driver;
	
	public lumalocator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	WebElement accountbtn;
	public WebElement accountbtn() {
		return accountbtn;
	}
	
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement email;
	public WebElement email() {
		return email;
	}
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement Password;
	public WebElement Password() {
		return Password;
	}
	
	@FindBy(xpath="//button[@type=\"submit\" and @id=\"send2\" and @class=\"action login primary\"]")
	WebElement loginbtn;
	public WebElement loginbtn() {
		return loginbtn;
		
	}
	
	@FindBy(xpath="//span[@class=\"logged-in\" and contains(text(),'Welcome, amar nam!')]")
	WebElement HomePageHeader;
	public WebElement HomePageHeader() {
		return HomePageHeader;
		
	}

}
*/
