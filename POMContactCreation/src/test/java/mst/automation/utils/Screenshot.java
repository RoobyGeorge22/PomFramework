package mst.automation.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import mst.automation.basetest.BaseTest;
import mst.automation.constant.Constant;

public class Screenshot extends BaseTest {
	public static void captureSS(String testCaseName) throws Exception {

		TakesScreenshot sshot = (TakesScreenshot) driver;
		File SFile = sshot.getScreenshotAs(OutputType.FILE);
		System.out.println(SFile);

		File file = new File(Constant.SSFile);

		String fileName = Constant.SSFile + testCaseName + ".jpg";

		FileUtils.copyFile(SFile, new File(fileName));

	}

}
