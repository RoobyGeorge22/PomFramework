package com.mst.advance.automation.stepDefinitions;



import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.HomePagePOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


public class HomeSteps extends BrowserFactory {

	HomePagePOM homepage;

	@Description("Verify the contact tab is clicked successfully")
	@Epic("EP002")
	@Feature("Feature1: HomePage")
	@Story("Story: contact tab ")
	@Step("Verify contact tab clicked")
	@Severity(SeverityLevel.MINOR)

	@Then("User should click Applauncher")
	public void user_click_the_applauncher() {
		homepage = new HomePagePOM(driver);
		homepage.clickApplaucher();
		
	}

	@And("User should click Searchbox")
	public void user_open_the_Searchbox() {
		homepage.openSearchbox();
	}

	@And("User should click Contacts")
	public void user_click_the_Contact_tab() throws Throwable {
	
		homepage.clickContacts();
		String Title1 = driver.getTitle();
		System.out.println(Title1);
	}
}
