package com.mst.advance.automation.stepDefinitions;

import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.ContactCreationPage;
import com.mst.advance.automation.pages.HomePagePOM;
import com.mst.advance.automation.pages.LoginPagePOM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class ContactCreationSteps extends BrowserFactory {

	ContactCreationPage ccpage;

	@Description("Verify the contact is created successfully")
	@Epic("EP003")
	@Feature("Feature1: contact creation")
	@Story("Story: Verify contact creation ")
	@Step("Verify contact creation is success")
	@Severity(SeverityLevel.MINOR)

	@When("The user can able to create a contact")
	public void user_create_a_contact() {
		ccpage = new ContactCreationPage(driver);
		ccpage.contactCreation();

	}

	@And("User enters Firstname as {string} and lastname as {string}")
	public void user_enters_firstname_as_and_lastname_as(String firstname, String lastanme) {

		ccpage.enterFirstname(firstname);
		ccpage.enterlastName(lastanme);

	}

	@And("User enters Department as {string} and Title as {string}")
	public void user_enters_Department_as_and_title_as(String Department, String Title) {
		ccpage.enterdepartment(Department);
		ccpage.entertitle(Title);
	}

	@And("The contact is created successfully")
	public void user_created_a_contact() {
		ccpage.clicksavebtn();
		System.out.println("The contact is created successfully!!");
	}

}
