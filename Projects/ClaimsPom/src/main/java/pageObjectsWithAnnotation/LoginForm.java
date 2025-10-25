package pageObjectsWithAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm {



		@FindBy(id="tenant")
		public static WebElement client;
		
		@FindBy(id="username")

		public static WebElement username;
		
		@FindBy(id="password")

		public static WebElement password;
		
		@FindBy(xpath="//button[text()='Sign In']")

		public static WebElement submit;


}
