package mst.automation.regressiontestcases;

import org.testng.annotations.Test;

import mst.automation.basetest.BaseTest;
import mst.automation.pageobjects.ContactCreation;
import mst.automation.pageobjects.HomePage;
import mst.automation.pageobjects.LoginPage;

public class ContactCreationTest extends BaseTest{
	@Test
	public void ContactCreation() throws Exception {
		  loginpage=new LoginPage(driver);
		  loginpage.loginSalesforce();
		  homePage=new HomePage(driver);
		  homePage.homepageActions();
		  cCreationPage=new ContactCreation(driver);
		  cCreationPage.contactCreation();
	  }
}
