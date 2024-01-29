package mst.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import mst.automation.abstractclassess.DriverClass;
import mst.automation.utils.ConfigReader;


public class LoginPage extends DriverClass {

	@FindBy(id = "username")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement passWord;

	@FindBy(xpath = "//*[@id=\"Login\"]")
	public WebElement loginBtn;
	
	// constructor to initialize web elements

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	// Method for SalesForce Login

	public void loginSalesforce() {
		userName.sendKeys(ConfigReader.getData("username"));
		passWord.sendKeys(ConfigReader.getData("password"));
		loginBtn.click();
		
		
	}

}
