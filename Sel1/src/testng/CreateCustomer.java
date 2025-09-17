package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCustomer {

	
   @Test(invocationCount = 1, priority = 0)
	public void CreateCustomer() {
		
		System.out.println("Created a Customer");
	}
   
   @Test(priority=1,dependsOnMethods = "CreateCustomer")
   public void modifyCustomer() {
		//Assert.fail();
		System.out.println("Modified a Customer");
	}
   
   @Test(priority = 2, dependsOnMethods = {"CreateCustomer","modifyCustomer"})
   public void deleteCustomer() {
		
		System.out.println("Deleted the customer");
	}

}
