package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonFunctions.CommonFunc;
import pageObjectsWithAnnotation.LoginForm;
import pages.RegistrationPage;


public class RegistrationTestCase extends CommonFunc{
	@BeforeMethod
	public void login() {
	
		
	PageFactory.initElements(driver, LoginForm.class);
//	LoginForm.client.sendKeys(property.getProperty("tenant"));
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement tenantField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tenant")));
	tenantField.sendKeys(property.getProperty("tenant"));
	LoginForm.username.sendKeys(property.getProperty("username"));
	LoginForm.password.sendKeys(property.getProperty("password"));
	LoginForm.submit.click();
	}
	
	@Test
	public void register() throws AWTException, InterruptedException {
	
		
		PageFactory.initElements(driver, RegistrationPage.class);
		//RegistrationPage.empid.sendKeys("23");
		WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait for the empid input field to be present and interactable
        WebElement empIdField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='number'])[1]")));
        empIdField.sendKeys("23");
		RegistrationPage.empname.sendKeys("jerry");
		RegistrationPage.email.sendKeys("stellak@torus.tech");
		RegistrationPage.upoption.click();
		
		Thread.sleep(3000);
		 
        String filePath = "C:\\Users\\stellak\\Downloads\\download.jpg";  // Update with your file path

        
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Use Robot to paste the file path and press ENTER
        Robot robot = new Robot();
//		Thread.sleep(3000);

        // Press CTRL+V to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        // Press ENTER to upload the file
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
		RegistrationPage.department.sendKeys("Dev");
		
		
		RegistrationPage.submit.click();

	}
	
	@Test
	public void registerwithdetails() {
		
		PageFactory.initElements(driver, RegistrationPage.class);
		
		RegistrationPage.categorydetailsbtn.click();;
		RegistrationPage.addcategory.sendKeys("Food");
		RegistrationPage.addcategoryamount.sendKeys("1500");
		RegistrationPage.saveallbtn.click();;
		
	}

}
