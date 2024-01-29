package mst.automation.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mst.automation.abstractclassess.DriverClass;
import mst.automation.utils.ClickAElement;
import mst.automation.utils.ConfigReader;

public class HomePage extends DriverClass {

	@FindBy(xpath = "//button[contains(@class,'IdentityAppLauncherHeader')]")
	public WebElement appLauncher;

	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	public WebElement searchBox;

	@FindBy(xpath = "//div[@class='al-menu-dropdown-list' and @aria-label='Items']")
	public WebElement contactTab;

	// constructor to initialize web elements

	public HomePage(WebDriver driver) {
		super(driver);

	}

	

	// Method to click Contacts tab

	public void homepageActions() {
		ClickAElement.elementClick(appLauncher);
		appLauncher.click();
		ClickAElement.elementClick(searchBox);
		searchBox.sendKeys(ConfigReader.getData("Searchbox"));
		ClickAElement.elementClick(contactTab);
		contactTab.click();

	}

}
