package com.mindtree.PageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponents.Helper;
import com.mindtree.UIStore.SearchUI;
import com.mindtree.Utilities.ExtentLog;
import com.relevantcodes.extentreports.ExtentTest;

public class AddCart {
	WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public AddCart(WebDriver driver) {
		this.driver=driver;
	}
	public void clickingsearchbox(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		
		if(Helper.click(driver, SearchUI.searchbox, log, test)) {
			ExtentLog.extentlogInfo("clicking on searchbox done", test, log);
		}
		
	}
	public void sendingkeystosearchbox(Logger log, ExtentTest test, String arg1) {
		// TODO Auto-generated method stub
		if(Helper.sendkeys(driver, SearchUI.searchbox, arg1, log, test)) {
			ExtentLog.extentlogInfo("sending keys to searchbox", test, log);
		}
	}
	public void clickingsearchbtn(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		if(Helper.click(driver, SearchUI.searchbtn, log, test)) {
			ExtentLog.extentlogInfo("clicking on search button", test, log);
		}
	}
	public void clickingfromlist(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		if(Helper.clickfromlist(driver, SearchUI.listofchoclates, log, test)) {
			ExtentLog.extentlogInfo("clicked item from list", test, log);
		}
	}
	public void clickAddCart(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		List<String> handles=new ArrayList<String>(driver.getWindowHandles());
		for(String windows:handles) {
			driver.switchTo().window(windows);
		}
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		if(Helper.click(driver, SearchUI.addcart, log, test)) {
			ExtentLog.extentlogInfo("clicking add to cart successfull", test, log);
		}
	}
	public void clickonproceed(Logger log, ExtentTest test) {
		// TODO Auto-generated method stub
		if(Helper.click(driver, SearchUI.proceedtobuy, log, test)) {
			ExtentLog.extentlogInfo("clicking proceed to buy successfull", test, log);
		}
		driver.close();
	}
}
