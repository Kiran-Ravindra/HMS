package com.testng.annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class User extends BaseClass {
	
	@Test(groups = "SmokeTest")
	public void createUser() {
		Reporter.log("Created a User",true);
	}
	@Test(groups = "RegressionTest")
	public void modifyUser() {
		
		Reporter.log("Modified the user",true);
	}
	@Test(groups = "RegressionTest")
	public void deleteUser() {
		Reporter.log("Deleted the user",true);
		
	}

}
