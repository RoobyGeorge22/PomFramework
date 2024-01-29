package mst.automation.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import mst.automation.browserfactory.BrowserFactory;
import mst.automation.pageobjects.ContactCreation;
import mst.automation.pageobjects.HomePage;
import mst.automation.pageobjects.LoginPage;
import mst.automation.utils.ConfigReader;
import mst.automation.utils.DataUtils;
import mst.automation.utils.Screenshot;

public class BaseTest {
	protected static WebDriver driver;
	protected String browserName;

	protected static HomePage homePage;
	protected static LoginPage loginpage;
	protected static ContactCreation cCreationPage;

	@BeforeSuite
	public void setUp() throws Throwable {
		ConfigReader.getPropertiesData();
		DataUtils.openStream();
	}

	@BeforeMethod
	@Parameters({ "browserType" })
	public void openBrowser(String browserType) {

		{

			try {
				driver = BrowserFactory.loadDriver(browserType.toUpperCase());
			} catch (Exception e) {
				System.out.println("Exception occurs");
			}

			driver.get(ConfigReader.getData("URL"));
			driver.manage().window().maximize();
		}
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		String methodName = result.getMethod().getMethodName();

		if (result.getStatus() == ITestResult.FAILURE) {

			Screenshot.captureSS(methodName);
		}

		if (driver != null) {
			{
				driver.manage().deleteAllCookies();
				driver.quit();
			}
		}
	}
}
