package com.mindtree.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {
	static Propertiesop p=new Propertiesop();
	public static WebDriver getDriver() {
		 System.setProperty("webdriver.chrome.driver",p.getproperties("chromedriver"));
		  WebDriver driver=new ChromeDriver();
		  driver.get(p.getproperties("url"));
		  return driver;
	}
}
