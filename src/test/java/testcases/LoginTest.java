package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void LoginFailiurTest() {
		
		LoginPage Login = new LoginPage(GetDriver());
		Login.loginfunction("xyz@gmail.com","Xyz@1234");
			
		WebElement errormessage = driver.findElement(By.id("msg_box"));
		System.out.println("Error message is : "+ errormessage.getText());
		
		String actmsg = errormessage.getText();
		String expmsg = "The email or password you have entered is invalid.";
		Assert.assertEquals(actmsg, expmsg);
	}

	@Test
	public void LoginSuccessTest() {
		
		LoginPage Login = new LoginPage(GetDriver());
		Login.loginfunction("real@abc.com","RealPwd@1234");
		
		
	}	

}
