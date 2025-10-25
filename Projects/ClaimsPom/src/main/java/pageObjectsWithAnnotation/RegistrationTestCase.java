package pageObjectsWithAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationTestCase {

	@Test
	public void log() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stellak\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://torusclaims1.gsstvl.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, LoginForm.class);
		LoginForm.client.sendKeys("CT162");
		LoginForm.username.sendKeys("stella");
		LoginForm.password.sendKeys("stella@123");
		LoginForm.submit.click();
		
		PageFactory.initElements(driver, RegistrationForm.class);
		RegistrationForm.empid.sendKeys("1");
		RegistrationForm.empname.sendKeys("stella");
		RegistrationForm.email.sendKeys("stellak@torus.tech");
		RegistrationForm.department.sendKeys("Dev");
		RegistrationForm.submit.click();


	}
}
