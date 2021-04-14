package com.mindtree.PageObject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponents.Helper;
import com.mindtree.UIStore.HomePageUI;
import com.mindtree.UIStore.HomePageUI;
import com.mindtree.Utilities.ExtentLog;
import com.relevantcodes.extentreports.ExtentTest;

import junit.framework.Assert;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loggingin(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		if(Helper.click(driver, HomePageUI.signinbtn, log, test)) {
			ExtentLog.extentlogInfo("Signing in button successfull", test, log);
		}
	}
	
	public void enteremail(Logger log,ExtentTest test,String arg1) {
		if(Helper.sendkeys(driver, HomePageUI.email, arg1, log, test)) {
			ExtentLog.extentlogInfo("entering email successfull", test, log);
		}
	}
	public void cntnue(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		if(Helper.click(driver, HomePageUI.cntnue, log, test)) {
			ExtentLog.extentlogInfo("clicking continue successfull", test, log);
		}
	}
	public void enterpwd(Logger log,ExtentTest test,String arg1) {
		if(Helper.sendkeys(driver, HomePageUI.pwd, arg1, log, test)) {
			ExtentLog.extentlogInfo("entering password successfull", test, log);
		}
	}
	public void login(Logger log, ExtentTest test) throws InterruptedException {
		// TODO Auto-generated method stub
		if(Helper.click(driver, HomePageUI.login, log, test)) {
			ExtentLog.extentlogInfo("clicking login successfull", test, log);
			Thread.sleep(20000);
		}
	}

	public void verify(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(Helper.verifypage(ExpectedTitle, ActualTitle, log, test,driver)) {
			ExtentLog.extentlogInfo("page got verified", test, log);
		}
	}
	
}
