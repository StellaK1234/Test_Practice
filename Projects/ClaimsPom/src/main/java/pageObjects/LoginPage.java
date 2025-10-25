package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

		
		public static WebElement client(WebDriver driver) {
		
		return driver.findElement(By.id("client"));
		}
		public static WebElement username(WebDriver driver) {
			
		return driver.findElement(By.id("username"));
		}
		public static WebElement password(WebDriver driver) {
			
		return driver.findElement(By.id(""));
		}
		public static WebElement click(WebDriver driver) {
			
		return driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		}
}
