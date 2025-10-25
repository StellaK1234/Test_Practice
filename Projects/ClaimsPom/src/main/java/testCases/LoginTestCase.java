package testCases;

import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class LoginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stellak\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://torusclaims.gsstvl.com/");
		
	//	LoginPage loginpage = new LoginPage();
		LoginPage.client(driver).sendKeys("CT162");
		LoginPage.username(driver).sendKeys("morbium");
		LoginPage.password(driver).sendKeys("morbium@123");
		LoginPage.click(driver).click();
	}
}
