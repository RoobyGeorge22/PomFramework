package com.mst.advance.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.mst.advance.automation.abstractclass.DriverClass;
import com.mst.advance.automation.reports.Report;




public class LoginPagePOM extends DriverClass{
	
	@FindBy(id = "username")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement passWord;

	@FindBy(xpath = "//*[@id=\"Login\"]")
	public WebElement loginBtn;
	
	
	
	public LoginPagePOM(WebDriver driver) {
		super(driver);
		
	}
	
	public void enterUsername(String username) {
		Report.startReport();
		Report.createTestCase("TC001 - Login Page", "RoobyGeorge", "Regression");
		userName.sendKeys(username);
	}

	public void enterPassworkd(String password) {
		passWord.sendKeys(password);
		
	}
	public HomePagePOM clickLoginbtn() throws Throwable {
		loginBtn.click();
		
		
		String currUrl = driver.getCurrentUrl();
		System.out.println("Login Page Current URL - " + currUrl);
		if (currUrl.equals("https://mastek37-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home")) {
			Report.testStep("pass", "Logged In Successfully");
			
		} else {
			Report.testStep("fail", "Login failed");
			Report.ss();
			Report.stopReport();
			
		}
		return new HomePagePOM(driver);
	}
}
