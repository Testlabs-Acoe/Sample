package com.mindtree.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class LogUtility {
	private static Screenshot s;
	static Propertiesop p = new Propertiesop();
	static {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		System.setProperty("current.date.time", dateFormat.format(new Date()));
	}
	public static void setLog() throws FileNotFoundException {
		FileInputStream file=new FileInputStream(p.getproperties("logfile"));
		PropertyConfigurator.configure(file);
	}
	WebDriver driver;
	
	public LogUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public LogUtility() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void info(String message,Logger log, WebDriver driver) {
		log.info(message);
	}
	
	public static void warn(String message,Logger log,WebDriver driver) {
		log.warn(message);
	}
	public static void error(String message,Logger log, WebDriver driver) {
		log.error(message);
	}
	public static void debug(String message,Logger log,WebDriver driver) {
		log.debug(message);
	}
}
