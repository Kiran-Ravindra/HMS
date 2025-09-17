package com.listeners.selenium;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.listeners.selenium.ListernersClass.class)
public class CustomerClass extends BaseClass {
	
	@Test(priority = 0)
	public void CreateCustomer() {
		
		Reporter.log("Created a Customer",true);
		
	}

	@Test(priority = 1)
   public void ModifyCustomer() {
		Assert.fail();
		Reporter.log("Modified a Customer",true);
	} 
   
	@Test(priority = 2)
   public void deleteCustomer() {
		
		Reporter.log("Delete a Customer",true);
	}
}
