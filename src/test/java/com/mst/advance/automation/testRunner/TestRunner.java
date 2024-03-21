package com.mst.advance.automation.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\SF.feature",glue= {"com.mst.advance.automation.stepDefinitions"},monochrome = true,publish = true,

plugin= {"pretty","html:target/HtmlReport/report.html","json:target/Jsonreport/report.json","junit:target/JunitReport/report.xml"},
tags="@smokeTest")
public class TestRunner extends AbstractTestNGCucumberTests{

}
