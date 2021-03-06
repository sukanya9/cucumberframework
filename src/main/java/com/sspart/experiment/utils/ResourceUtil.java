package com.sspart.experiment.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ResourceUtil {
	public static Properties props= null;
	
	public void initiateLocators() throws FileNotFoundException, IOException {
	
		props = new Properties();
		//File file = new File("src/main/resources/locators/MyLocators.loc");
		File locatorsFolder = new File("src/main/resource/locators");
		
		for(File eachLocatorFile : locatorsFolder.listFiles()) {
			props.load(new FileInputStream(eachLocatorFile));
		}
		
		
	}
}
