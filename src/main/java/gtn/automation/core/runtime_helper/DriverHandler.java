package gtn.automation.core.runtime_helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import gtn.automation.core.runtime_helper.exceptions.InvalideBrowserType;

public class DriverHandler {
	public static WebDriver getNewDriver(String browser, String driverPath) throws InvalideBrowserType {
		WebDriver driver;
		
		switch (browser.toLowerCase()) {
		
		case "chrome": {
			System.setProperty("webdriver.chrome.driver", driverPath); 
			driver = new ChromeDriver();
		}
			break;
		
		case "firefox": {
			System.setProperty("webdriver.gecko.driver", driverPath); 
			driver = new FirefoxDriver();
		}
			break;

		case "ie": {
			System.setProperty("webdriver.ie.driver", driverPath); 
			driver = new InternetExplorerDriver();
		}
			break;
			
		default:
			throw new InvalideBrowserType("Invalid browser type " + browser);
		}
		
		return driver;
	}
}