package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConfigPropertiesController {
	
	public static String getConfigValue(String filename,String key) {
		Properties properties = new Properties();
		String value = null;
		try {
			FileInputStream file = new FileInputStream(".src/main/resources/Objectrepositiries/"+filename+".properties");
			properties.load(file);
			value = properties.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	
	}

