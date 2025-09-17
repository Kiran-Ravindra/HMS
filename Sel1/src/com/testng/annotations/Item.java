package com.testng.annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Item extends BaseClass {
	
	@Test(groups = "SmokeTest")
	public void createItem() {
		Reporter.log("Created a Item",true);
	}
	@Test(groups = "RegressionTest")
	public void modifyItem() {
		
		Reporter.log("Modified the Item",true);
	}
	@Test(groups = "RegressionTest")
	public void deleteItem() {
		Reporter.log("Deleted the Item",true);
		
	}

}
