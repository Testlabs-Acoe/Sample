package com.mindtree.Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentLog {
	private static LogUtility logreport=new LogUtility();
	static WebDriver driver;
	
	public ExtentLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExtentLog(WebDriver driver) {
		this.driver=driver;
	}
	
	public static void extentlogInfo(String message,ExtentTest test,Logger log) {
		test.log(LogStatus.PASS, message);
		logreport.info(message, log,driver);
	}

	public static void extentlogWarn(String message,ExtentTest test,Logger log) {
		test.log(LogStatus.PASS, message);
		logreport.warn(message, log,driver);
	}

	public static void extentlogError(String message,ExtentTest test,Logger log) {
		test.log(LogStatus.PASS, message);
		logreport.error(message, log,driver);
	}
	public static void extentlogDebug(String message,ExtentTest test,Logger log) {
		test.log(LogStatus.PASS, message);
		logreport.debug(message, log, driver);
	}

}
