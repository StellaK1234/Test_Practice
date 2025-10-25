package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunc;
import pageObjectsWithAnnotation.LoginForm;

public class LoginTestCase extends CommonFunc{

	@Test
	public  void logintest()  {
		
		PageFactory.initElements(driver, LoginForm.class);
		LoginForm.client.sendKeys(property.getProperty("client"));
		LoginForm.username.sendKeys(property.getProperty("username"));
		LoginForm.password.sendKeys(property.getProperty("password"));
		LoginForm.submit.click();
	}
	
}
