package com.auto.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.auto.properties.File_Read_manger;
import com.maven.automation.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\auto\\feature\\auto.feature",
glue="com.auto.step")

public class Run {
	
	public static  WebDriver driver;
	
	@BeforeClass
	public static void Startup() throws Throwable {
		
	String browser = File_Read_manger.Inst().Instance().getbrowser();
		driver = BaseClass.getBrowser(browser);

	}
	@AfterClass 
	public static void Closeup() {
		driver.close();
	}
}
