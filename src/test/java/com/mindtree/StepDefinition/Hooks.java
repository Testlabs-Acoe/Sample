package com.mindtree.StepDefinition;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.Runner.Runner;
import com.mindtree.Utilities.ExtentUtility;
import com.mindtree.Utilities.LogUtility;
import com.mindtree.Utilities.Propertiesop;
import com.mindtree.Utilities.utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	static String extentreportpath=ExtentUtility.pathforReport();
	static WebDriver driver;
	static Propertiesop p = new Propertiesop();
	public static ExtentReports extent;
	public static ExtentTest test;
	static Logger log ;

	@Before("@FB,@Addcart")
	public static void openBrowser() {
		try {
			LogUtility.setLog();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		driver= utility.getDriver();
		extent = ExtentUtility.startest(extentreportpath);
		test = extent.startTest("Login");
		log=Logger.getLogger(Runner.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@After("@FB,@Addcart")
	public static void closeBrowser() {
//		driver.close();
		ExtentUtility.endtest(test);
	}

}
