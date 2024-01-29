package mst.automation.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mst.automation.basetest.BaseTest;

public class ClickAElement extends BaseTest {
	
	public static void elementClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
