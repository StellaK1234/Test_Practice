package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


	@FindBy(id="tenant")
	public static WebElement tenant;
	
	@FindBy(id="username")

	public static WebElement username;
	
	@FindBy(id="password")

	public static WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")

	public static WebElement submit;
}
