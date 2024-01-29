package mst.automation.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserFactory {

	protected static WebDriver driver;
	public enum driversupportedBrowsers {
		CHROME, FIREFOX, IE
	}
	public static WebDriver loadDriver(String browserType) {
		WebDriver loadDriver = getBrowser(driversupportedBrowsers.valueOf(browserType));
		return loadDriver;
		
	}
	private static WebDriver getBrowser(driversupportedBrowsers browserName) {
		switch(browserName) {
		case CHROME:
			driver= new ChromeDriver();
			break;
		case FIREFOX:
			driver= new FirefoxDriver();
			break;
		case IE:
			driver= new InternetExplorerDriver();
			break;
		default:
			System.out.println("Invalid Encounter");
			
		}
		return driver;
	}
}
