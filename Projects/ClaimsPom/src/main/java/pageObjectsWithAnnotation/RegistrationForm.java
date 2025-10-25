package pageObjectsWithAnnotation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationForm {
	
	@FindBy(xpath="//input[@type='number']")
	public static WebElement empid;
	
	@FindBy(xpath="//input[@type='string']")

	public static WebElement empname;
	
	@FindBy(xpath="(//input[@type='string'])[2]")

	public static WebElement email;
	
	@FindBy(xpath="(//input[@type='string'])[3]")

	public static WebElement department;
	
	@FindBy(xpath="//span[text()='Submit']")
	public static WebElement submit;
}
