package com.mindtree.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;
import com.mindtree.ReusableComponents.Helper;
public class Screenshot {
	WebDriver driver;
	static Propertiesop p=new Propertiesop();
	
	public Screenshot(WebDriver driver) {
		this.driver=driver;
	}
	
	public String takescreenshot() throws IOException{
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File name=new File(p.getproperties("screenshot")+Helper.datelog()+".png");
    Files.copy(screenshot, name);
    String path=name.getAbsolutePath();
    System.out.println(path);
    return path;
	}

}
