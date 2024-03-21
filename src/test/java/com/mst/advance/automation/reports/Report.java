package com.mst.advance.automation.reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.mst.advance.automation.browserfactory.BrowserFactory;

public class Report extends BrowserFactory{

	static ExtentReports extent;
	static ExtentTest extenttest;

	// Method for start report
	public static void startReport() {
		ExtentSparkReporter extentsparkreporter = new ExtentSparkReporter(
				"C:\\Users\\Rooby.g\\eclipse-workspace\\CucumberPOM\\src\\test\\resources\\ExtentReports\\Testreports.html");
		extent = new ExtentReports();
		extent.attachReporter(extentsparkreporter);
	}

	// Method for close report
	public static void stopReport() {
		extent.flush();
	}

	// Method for creating the test case
	public static void createTestCase(String desc, String author, String category) {
		extenttest = extent.createTest(desc);
		extenttest.assignAuthor(author);
		extenttest.assignCategory(category);
	}

	// Method for creating the test steps
	public static void testStep(String status, String description) {
		switch (status.toLowerCase()) {
		case "pass":
			extenttest.pass(description);
			break;
		case "fail":
			extenttest.fail(description);
			break;
		case "information":
			extenttest.info(description);
			break;
		case "warning":
			extenttest.warning(description);
			break;
		default:
			System.err.println("Status not found");
		}
	}

	public static void ss() throws IOException {
		File sshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "\\Screenshot\\ss.png";

		FileUtils.copyFile(sshot, new File(path));
		extenttest.addScreenCaptureFromPath(path);

	}
}
