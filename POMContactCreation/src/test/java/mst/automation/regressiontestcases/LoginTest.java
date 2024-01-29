package mst.automation.regressiontestcases;

import org.testng.annotations.Test;
import mst.automation.basetest.BaseTest;
import mst.automation.pageobjects.LoginPage;

public class LoginTest extends BaseTest{
  @Test
  public void VerifyLongin() {
	 
	  loginpage=new LoginPage(driver);
	  loginpage.loginSalesforce();
	
  }
}
