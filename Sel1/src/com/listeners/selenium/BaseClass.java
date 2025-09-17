package com.listeners.selenium;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseClass {
	
	 @BeforeClass
	  public void OpenBrowser() {
		  
		  System.out.println(" Open Browser");
		
	}
	  
	  @AfterClass
	  public void CloseBrowser() {
		  
		  System.out.println("Close Browser ");
		
	}
	
 @BeforeMethod	
  public void Login() {
	  
	  System.out.println(" Login");
	
}
  
 @AfterMethod
  public void Logout() {
	  
	  System.out.println("Logout ");
	
}
  

}
