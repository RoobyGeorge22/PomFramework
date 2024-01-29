package mst.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import mst.automation.abstractclassess.DriverClass;
import mst.automation.utils.ClickAElement;
import mst.automation.utils.DataUtils;
import mst.automation.utils.Screenshot;

public class ContactCreation extends DriverClass {

	// Contact Information

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
	public WebElement firstName;

	@FindBy(xpath = "//label[contains(text(),'Last Name')]//following::input[@name='lastName']")
	public WebElement lastName;

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

	// Address Information

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

	// Description Information

	@FindBy(xpath = "//label[contains(text(),'Description')]//following-sibling::div/textarea")
	public WebElement description;

	@FindBy(xpath = "//button[contains(text(),'Save') and @name='SaveEdit']")
	public WebElement saveBtn;

	// constructor to initialize web elements
	public ContactCreation(WebDriver driver) {
		super(driver);

	}
	// To Create Contact record

	public void contactCreation() throws Exception {
		ClickAElement.elementClick(newButton);
		newButton.click();
		ClickAElement.elementClick(recordType);
		recordType.click();
		ClickAElement.elementClick(nextBttn);
		nextBttn.click();
		ClickAElement.elementClick(salutation);
		salutation.click();
		salutationoptn.click();
		firstName.sendKeys(DataUtils.readExcelData("Sheet1", "First Name", "TC 01"));
		lastName.sendKeys(DataUtils.readExcelData("Sheet1", "Last Name", "TC 01"));
		title.sendKeys(DataUtils.readExcelData("Sheet1", "Title", "TC 01"));
		department.sendKeys(DataUtils.readExcelData("Sheet1", "Department", "TC 01"));
		birthDate.sendKeys(DataUtils.readExcelData("Sheet1", "Birthday", "TC 01"));
		checkingCon.sendKeys(DataUtils.readExcelData("Sheet1", "Checking con", "TC 01"));
		phone.sendKeys(DataUtils.readExcelData("Sheet1", "Phone", "TC 01"));
		homePhone.sendKeys(DataUtils.readExcelData("Sheet1", "Home Phone", "TC 01"));
		mobilePhone.sendKeys(DataUtils.readExcelData("Sheet1", "Mobile", "TC 01"));
		otherPhone.sendKeys(DataUtils.readExcelData("Sheet1", "Other Phone", "TC 01"));
		fax.sendKeys(DataUtils.readExcelData("Sheet1", "Fax", "TC 01"));
		email.sendKeys(DataUtils.readExcelData("Sheet1", "Email", "TC 01"));
		assistant.sendKeys(DataUtils.readExcelData("Sheet1", "Assistant", "TC 01"));
		assistantPhone.sendKeys(DataUtils.readExcelData("Sheet1", "Asst. Phone", "TC 01"));
		languages.sendKeys(DataUtils.readExcelData("Sheet1", "Languages", "TC 01"));
		level.click();
		levelOpt.click();
//		ClickAElement.elementClick(leadsource);
//		leadsource.click();
//		ClickAElement.elementClick(leadsourceOpt);
//		leadsourceOpt.click();
		mailingStreet.sendKeys(DataUtils.readExcelData("Sheet1", "Mstreet", "TC 01"));
		mailingCity.sendKeys(DataUtils.readExcelData("Sheet1", "Mcity", "TC 01"));
		mailingProvince.sendKeys(DataUtils.readExcelData("Sheet1", "Mstate", "TC 01"));
		mailingPostalCode.sendKeys(DataUtils.readExcelData("Sheet1", "Mzipcode", "TC 01"));
		mailingCountry.sendKeys(DataUtils.readExcelData("Sheet1", "Mcountry", "TC 01"));
		street.sendKeys(DataUtils.readExcelData("Sheet1", "Street", "TC 01"));
		city.sendKeys(DataUtils.readExcelData("Sheet1", "city", "TC 01"));
		province.sendKeys(DataUtils.readExcelData("Sheet1", "State", "TC 01"));
		postalCode.sendKeys(DataUtils.readExcelData("Sheet1", "Zipcode", "TC 01"));
		country.sendKeys(DataUtils.readExcelData("Sheet1", "country", "TC 01"));
		description.sendKeys(DataUtils.readExcelData("Sheet1", "Description", "TC 01"));
		saveBtn.click();
		

	}
}
