package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApprovalTestCase {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stellak\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://torusclaims1.gsstvl.com/");
		String title =driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("client")).sendKeys("CT154");
		driver.findElement(By.id("username")).sendKeys("morbium");
		driver.findElement(By.id("password")).sendKeys("morbium@123");
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	
	}

}
