package com.mindtree.ReusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.Utilities.ExtentLog;
import com.mindtree.Utilities.ExtentUtility;
import com.mindtree.Utilities.LogUtility;
import com.relevantcodes.extentreports.ExtentTest;

import junit.framework.Assert;
public class Helper {
	WebDriver driver;
	
	public Helper(WebDriver driver) {
		this.driver=driver;
	}
	
	public static String datelog() {
		String name="";
		Date d=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy/HH/mm/ss");
		name=dateformat.format(d);
		name=name.replaceAll("/","_");
		return name;
	}

	public static boolean click(WebDriver driver, By by, Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(by).click();
			return true;
		}catch(Exception e) {
			LogUtility.error("error in clicking", log,driver);
			ExtentUtility.testfail(test, "error in clicking", driver);
		}
		return false;
	}

	public static boolean sendkeys(WebDriver driver, By by, String keys, Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(by).sendKeys(keys);
			return true;
		}catch(Exception e) {
			LogUtility.error("sending keys got failed", log,driver);
			ExtentUtility.testfail(test, "error in sending keys", driver);
		}
		return false;
	}
	public static boolean selectValueFromDropdown(By by,WebDriver driver,ExtentTest test,Logger log,String values) {
		try {
			Select field=new Select(driver.findElement(by));
			field.selectByVisibleText(values);
			return true;
		}
		catch(Exception e) {
			LogUtility.error("selecting value got failed", log, driver);
			ExtentUtility.testfail(test, "error in selecting value", driver);
		}
		return false;
	}
	
	public static boolean clickfromlist(WebDriver driver, By by, Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		try {
			driver.findElements(by).get(2).click();
			return true;
		}catch(Exception e) {
			LogUtility.error("error in clicking", log,driver);
			ExtentUtility.testfail(test, "error in clicking", driver);
		}
		return false;
	}
	
	public static boolean verifypage(String expected,String actual,Logger log,ExtentTest test,WebDriver driver) {
		try {
			Assert.assertEquals(expected, actual);
			return true;
		}
		catch(Exception e) {
			ExtentUtility.testfail(test, "page not verified", driver);
		}
		return false;
	}
}
