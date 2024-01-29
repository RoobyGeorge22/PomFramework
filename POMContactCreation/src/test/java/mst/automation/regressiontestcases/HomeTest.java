package mst.automation.regressiontestcases;

import org.testng.annotations.Test;

import mst.automation.basetest.BaseTest;
import mst.automation.pageobjects.HomePage;
import mst.automation.pageobjects.LoginPage;


public class HomeTest extends BaseTest{
	@Test
	public void searchContacts() {
		  loginpage=new LoginPage(driver);
		  loginpage.loginSalesforce();
		  homePage=new HomePage(driver);
		  homePage.homepageActions();
	  }
}
