package com.mst.advance.automation.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.HomePagePOM;
import com.mst.advance.automation.pages.LoginPagePOM;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class LoginStepsPOM extends BrowserFactory {

	LoginPagePOM login;

	@Description("Verify the salesforce logged in successfully")
	@Epic("EP001")
	@Feature("Feature1: Login")
	@Story("Story: Verify login")
	@Step("Verify the salesforce log in")
	@Severity(SeverityLevel.MINOR)

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("****** POM with BDD ******");
		String Title = driver.getTitle();
		System.out.println(Title);

	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_and_password(String username, String password) {
		login = new LoginPagePOM(driver);
		login.enterUsername(username);
		login.enterPassworkd(password);
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() throws Throwable {
		login.clickLoginbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));

	}

}
