package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

	@FindBy(xpath="(//input[@type='number'])[1]")
	public static WebElement empid;
	
	@FindBy(xpath="//input[@type='string']")

	public static WebElement empname;
	
	@FindBy(xpath="(//input[@type='string'])[2]")

	public static WebElement email;
	
	@FindBy(xpath="(//input[@type='string'])[3]")

	public static WebElement department;
	
	@FindBy(xpath="//button[text()='select']")
	public static WebElement upoption;
	
	@FindBy(xpath="//span[text()='Submit']")
	public static WebElement submit;
	
	@FindBy(xpath="(//*[local-name()='svg' and @fill='currentColor'])[6]")
	public static WebElement categorydetailsbtn;
	
	@FindBy(xpath="//input[@name='category']")
	public static WebElement addcategory;
	
	@FindBy(xpath="//input[@name='category_amount']")
	public static WebElement addcategoryamount;
	
	
	@FindBy(xpath="//span[text()='Save All']")
	public static WebElement saveallbtn;

	
	
	
}
