package mst.automation.utils;

import java.util.Properties;

import org.testng.annotations.Test;

import mst.automation.constant.Constant;

import java.io.FileInputStream;

public class ConfigReader {

	protected static final Properties properties = new Properties();

	public static Properties getPropertiesData() throws Exception {

		FileInputStream fileInputStream = new FileInputStream(Constant.PropertyFile);
				
		properties.load(fileInputStream);

		return properties;
	}

	public static String getData(String keyWord) {
		System.out.println(properties.getProperty(keyWord));
		return properties.getProperty(keyWord);
	}
}