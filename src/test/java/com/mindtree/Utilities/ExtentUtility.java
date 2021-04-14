package com.mindtree.Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponents.Helper;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentUtility {
	static Propertiesop p = new Propertiesop();
	public static ExtentReports extent;
	public static ExtentTest test;
	private static Screenshot s;

	public static ExtentReports startest(String path) {
		extent = new ExtentReports(path, true);
		return extent;
	}

	public static void endtest(ExtentTest test) {
		extent.endTest(test);
		extent.flush();
	}	
	public static void testpass(ExtentTest test, String message,WebDriver driver) {
		test.log(LogStatus.PASS, message);
		s=new Screenshot(driver);
		try {
			s.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while taking screenshot");
		}
	}
	public static void testfail(ExtentTest test, String message,WebDriver driver) {
		test.log(LogStatus.FAIL, message);
		s=new Screenshot(driver);
		
		String imgpath = null;
		try {
			imgpath=s.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while taking screenshot");
		}
		test.log(LogStatus.FAIL,test.addScreenCapture(imgpath));
	}
	public static void testskip(ExtentTest test, String message,WebDriver driver) {
		test.log(LogStatus.SKIP, message);
		s=new Screenshot(driver);
		try {
			s.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while taking screenshot");
		}
	}
	public static void testwarning(ExtentTest test, String message,WebDriver driver) {
		test.log(LogStatus.WARNING, message);
		s=new Screenshot(driver);
		try {
			s.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while taking screenshot");
		}
	}

	public static String pathforReport() {
		// TODO Auto-generated method stub
		String path=p.getproperties("extentreports") + Helper.datelog() + ".html";
		return path;
	}
}
