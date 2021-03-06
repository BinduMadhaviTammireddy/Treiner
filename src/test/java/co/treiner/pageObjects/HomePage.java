package co.treiner.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Signup")
	WebElement signupLink;
	
	@FindBy(linkText="Login")
	WebElement loginLink;
	@FindBy(id="search_keywords")
	WebElement cityName;
	
	
	public void clickSignup()
	{	
		signupLink.click();
	}
	
	public void clicklogin()
	{	
		loginLink.click();
	}

}
