package pageObjectsWithAnnotation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stellak\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://torusclaims1.gsstvl.com/");
		
		PageFactory.initElements(driver, LoginForm.class);
		LoginForm.client.sendKeys("CT162");
		LoginForm.username.sendKeys("stella");
		LoginForm.password.sendKeys("stella@123");
		LoginForm.submit.click();

}
}