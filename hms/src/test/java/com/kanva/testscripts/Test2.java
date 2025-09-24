package com.kanva.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test2 {
    
	@Test
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
		Reporter.log("In Jenkins",true);
	}
}
