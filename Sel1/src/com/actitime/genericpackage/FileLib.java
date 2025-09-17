package com.actitime.genericpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileLib {
	
	public String readPropertyFile(String key ) throws FileNotFoundException {
	FileInputStream fis = new FileInputStream("./data/commondata.properties");
	Properties p = new Properties();
//	p.load(fis);
   	String data=p.getProperty(key);
     return data;
	
	
	}
	

}
