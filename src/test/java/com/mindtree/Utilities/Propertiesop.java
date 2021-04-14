package com.mindtree.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;


public class Propertiesop {
	 static Properties prop=new Properties();
	
	 public String getproperties(String key) {
	 try {
			prop.load(new FileInputStream(".\\src\\test\\java\\com\\mindtree\\config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 	String keys=prop.getProperty(key);
	    return keys;
	 }
}
