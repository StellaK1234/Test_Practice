package pageObjectsWithoutAnnotation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjectsWithAnnotation.LoginForm;

public class LoginTestCase {

	
		public  WebElement tenant;
		public  WebElement username;
		public  WebElement password;
	//	public  WebElement //button[text()='Sign In'];
		
		public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stellak\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://torusclaims1.gsstvl.com/");
		
		PageFactory.initElements(driver, LoginForm.class);
		tenant.sendKeys("CT162");
		username.sendKeys("stella");
		password.sendKeys("stella@123");
		//button[text()='Sign In'].click();

}
}
