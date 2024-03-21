package com.mst.advance.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mst.advance.automation.abstractclass.DriverClass;
import com.mst.advance.automation.reports.Report;


public class ContactCreationPage extends DriverClass {

	public ContactCreationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(text(),'New')]")
	public WebElement newButton;

	@FindBy(xpath = "//span[starts-with(text(),'Secondary')]/parent::div")
	public WebElement recordType;

	@FindBy(xpath = "//span[contains(text(),'Next')]/parent::button")
	public WebElement nextBttn;

	@FindBy(xpath = "//label[contains(text(),'Salutation')]/following::button[starts-with(@aria-label,'Salu')]")
	public WebElement salutation;

	@FindBy(xpath = "//lightning-base-combobox-item[contains(@data-value,'Mr.')]")
	public WebElement salutationoptn;

	@FindBy(xpath = "//label[contains(text(),'First Name')]//following::input[@name='firstName']")
	public WebElement FirstName;

	@FindBy(xpath = "//label[contains(text(),'Last Name')]//following::input[@name='lastName']")
	public WebElement LastName;

	@FindBy(xpath = "//label[contains(text(),'Title')]//following::input[@name='Title']")
	public WebElement title;

	@FindBy(xpath = "//label[contains(text(),'Department')]//following::input[@name='Department']")
	public WebElement department;

	@FindBy(xpath = "//label[contains(text(),'Birthdate')]//following::input[@name='Birthdate']")
	public WebElement birthDate;

	@FindBy(xpath = "//label[contains(text(),'checking con')]//following::input[@name='checking_con__c']")
	public WebElement checkingCon;

	@FindBy(xpath = "//label[contains(text(),'Phone')]//following::input[@name='Phone']")
	public WebElement phone;

	@FindBy(xpath = "//label[contains(text(),'Home Phone')]//following::input[@name='HomePhone']")
	public WebElement homePhone;

	@FindBy(xpath = "//label[contains(text(),'Mobile')]//following::input[@name='MobilePhone']")
	public WebElement mobilePhone;

	@FindBy(xpath = "//label[contains(text(),'Other Phone')]//following::input[@name='OtherPhone']")
	public WebElement otherPhone;

	@FindBy(xpath = "//label[contains(text(),'Fax')]//following::input[@name='Fax']")
	public WebElement fax;

	@FindBy(xpath = "//label[contains(text(),'Email')]//following::input[@name='Email']")
	public WebElement email;

	@FindBy(xpath = "//label[contains(text(),'Assistant')]//following::input[@name='AssistantName']")
	public WebElement assistant;

	@FindBy(xpath = "//label[contains(text(),'Asst. Phone')]//following::input[@name='AssistantPhone']")
	public WebElement assistantPhone;

	@FindBy(xpath = "//label[contains(text(),'Languages')]//following::input[@name='Languages__c']")
	public WebElement languages;

	@FindBy(xpath = "//label[contains(text(),'Level')]/following::button[starts-with(@aria-label,'Lev')]")
	public WebElement level;

	@FindBy(xpath = "//lightning-base-combobox-item[contains(@data-value,'Secondary')]")
	public WebElement levelOpt;

	@FindBy(xpath = "//label[contains(text(),'Lead Source')]/following::button[starts-with(@aria-label,'Lead')]")
	public WebElement leadsource;

	@FindBy(xpath = "//lightning-base-combobox-item[contains(@data-value,'Phone Inquiry')]")
	public WebElement leadsourceOpt;

	@FindBy(xpath = "//label[contains(text(),'Mailing Street')]//following-sibling::div/textarea[@name='street']")
	public WebElement mailingStreet;

	@FindBy(xpath = "//label[contains(text(),'Mailing City')]//following-sibling::div/input[@name='city']")
	public WebElement mailingCity;

	@FindBy(xpath = "//label[contains(text(),'Mailing State')]//following-sibling::div/input[@name='province']")
	public WebElement mailingProvince;

	@FindBy(xpath = "//label[contains(text(),'Mailing Zip/Postal Code')]//following-sibling::div/input[@name='postalCode']")
	public WebElement mailingPostalCode;

	@FindBy(xpath = "//label[contains(text(),'Mailing Country')]//following-sibling::div/input[@name='country']")
	public WebElement mailingCountry;

	@FindBy(xpath = "//label[contains(text(),'Other Street')]//following-sibling::div/textarea[@name='street']")
	public WebElement street;

	@FindBy(xpath = "//label[contains(text(),'Other City')]//following-sibling::div/input[@name='city']")
	public WebElement city;

	@FindBy(xpath = "//label[contains(text(),'Other State/Province')]//following-sibling::div/input[@name='province']")
	public WebElement province;

	@FindBy(xpath = "//label[contains(text(),'Other Zip/Postal Code')]//following-sibling::div/input[@name='postalCode']")
	public WebElement postalCode;

	@FindBy(xpath = "//label[contains(text(),'Other Country')]//following-sibling::div/input[@name='country']")
	public WebElement country;

	@FindBy(xpath = "//label[contains(text(),'Description')]//following-sibling::div/textarea")
	public WebElement description;

	@FindBy(xpath = "//button[contains(text(),'Save') and @name='SaveEdit']")
	public WebElement saveBtn;

	public void contactCreation() {

		Report.createTestCase("TC003 - Contact Creation Page", "Rooby", "Regression");
		newButton.click();
		Report.testStep("pass", "Clicked the new button.");
		recordType.click();
		Report.testStep("pass", "Entered the recordtype");
		nextBttn.click();
		Report.testStep("pass", "Clicked the next button");
		salutation.click();
    	salutationoptn.click();
    	Report.testStep("pass", "Entered the salutation");

	}

	public void enterFirstname(String firstname) {
		FirstName.sendKeys(firstname);
		Report.testStep("pass", "Entered the first name");
	}

	public void enterlastName(String lastName) {
		LastName.sendKeys(lastName);
		Report.testStep("pass", "Entered the last name");
	}

	public void entertitle(String Title) {
		title.sendKeys(Title);
		Report.testStep("pass", "Entered the title");
	}

	public void enterdepartment(String Department) {
		department.sendKeys(Department);
		Report.testStep("pass", "Entered the department");
	}

	public void entercheckingCon(String Con) {
		checkingCon.sendKeys(Con);
		Report.testStep("pass", "Entered the recordtype");
	}

	public void enterphone(String Phone) {
		phone.sendKeys(Phone);
	}

	public void enterhomePhone(String HomePhone) {
		homePhone.sendKeys(HomePhone);
	}

	public void entermobilePhone(String Mobile) {
		mobilePhone.sendKeys(Mobile);
	}

	public void enterfax(String Fax) {
		fax.sendKeys(Fax);
	}

	public void enteremail(String Email) {
		email.sendKeys(Email);
	}

	public void entermailingStreet(String Mstreet) {
		mailingStreet.sendKeys(Mstreet);
	}

	public void entermailingCity(String Mcity) {
		mailingCity.sendKeys(Mcity);
	}

	public void entermailingProvince(String Mstate) {
		mailingProvince.sendKeys(Mstate);
	}

	public void entermailingPostalCode(String Mzipcode) {
		mailingPostalCode.sendKeys(Mzipcode);
	}

	public void entermailingCountry(String Mcountry) {
		mailingCountry.sendKeys(Mcountry);
	}

	public void enterstreet(String Street) {
		street.sendKeys(Street);
	}

	public void entercity(String City) {
		city.sendKeys(City);
	}

	public void enterprovince(String State) {
		province.sendKeys(State);
	}

	public void enterpostalCode(String Zipcode) {
		postalCode.sendKeys(Zipcode);
	}

	public void entercountry(String Country) {
		country.sendKeys(Country);
	}

	public void entedescription(String Description) {
		description.sendKeys(Description);
	}

	public void clicksavebtn() {
		saveBtn.click();
		Report.testStep("pass", "Clicked the save button");
		Report.stopReport();
	}
}
