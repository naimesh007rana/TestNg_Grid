package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//============Locators==========================
	@FindBy(linkText="Log in")
	WebElement loginlink;
	
	@FindBy(name="user_login")
	WebElement username;
	
	@FindBy(name="user_pwd")
	WebElement password;
	
	@FindBy(id="remember-me")
	WebElement remember;
	
	@FindBy(name="btn_login")
	WebElement loginbutton;
	
	//===================functions==================
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginfunction(String usernames, String passwords) {
		
		
		loginlink.click();
		username.sendKeys(usernames);
		password.sendKeys(passwords);
		remember.click();
		loginbutton.click();
	}

}
