package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunc {
	public static Properties property=null;
	public static ChromeDriver driver=null;
	
	
	public  void loadproperty() throws IOException {
		FileInputStream inputstream = new FileInputStream("config.properties");
		 property = new Properties();
		property.load(inputstream);
	}
	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadproperty();
		String browser = property.getProperty("browser");
		String location = property.getProperty("driverLocation");
		String url = property.getProperty("url");
		//	if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", location);
			 driver = new ChromeDriver();
			
//		}else {
//			System.setProperty("webdriver.chrome.driver", "location");
//			 driver = new FirefoxDriver();
//		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
//	@AfterSuite
//	public void close() {
//		driver.quit();
//	}
	
}
