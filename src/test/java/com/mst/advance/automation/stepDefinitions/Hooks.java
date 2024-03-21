package com.mst.advance.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.mst.advance.automation.browserfactory.BrowserFactory;
import com.mst.advance.automation.pages.HomePagePOM;
import com.mst.advance.automation.pages.LoginPagePOM;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	protected LoginPagePOM login;
	protected static HomePagePOM homepage;
	protected static WebDriver driver;
	
	@Before
	public void setup() {
		driver = BrowserFactory.browserinvoke("chrome"); 
		driver.get("https://mastek37-dev-ed.develop.my.salesforce.com");
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}

}
