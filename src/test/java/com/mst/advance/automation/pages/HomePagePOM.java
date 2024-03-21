package com.mst.advance.automation.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.mst.advance.automation.abstractclass.DriverClass;
import com.mst.advance.automation.reports.Report;




public class HomePagePOM extends DriverClass{
	@FindBy(xpath = "//button[contains(@class,'IdentityAppLauncherHeader')]")
	public WebElement appLauncher;

	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	public WebElement searchBox;

	@FindBy(xpath = "//div[@class='al-menu-dropdown-list' and @aria-label='Items']")
	public WebElement contactTab;
	
	
	
	public HomePagePOM(WebDriver driver) {
		super(driver);
	}
	
	public void clickApplaucher() {
		Report.createTestCase("TC002 - Home Page", "RoobyGeorge", "Regression");
		appLauncher.click();
		Report.testStep("pass", "AppLauncher clicked");
	}
	public void openSearchbox() {
		searchBox.sendKeys("Contacts");
		Report.testStep("pass", "Clicked the searchbox and entered the value contact");
	}
	public ContactCreationPage clickContacts() throws Throwable {
		contactTab.click();
		
String currUrl = driver.getCurrentUrl();
		
		System.out.println(currUrl);
		if (currUrl.equals("https://mastek37-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home")) {
			Report.testStep("pass", "Clicked the contacts");
			
		} else {
			Report.testStep("fail", "Contact page is not found.");
			Report.ss();
			Report.stopReport();
			
		}
		return new ContactCreationPage(driver);
	}

}
