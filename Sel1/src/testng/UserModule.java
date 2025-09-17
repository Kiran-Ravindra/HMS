package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserModule {
	@Test(priority = 0)
	public void createUser() {
		
		System.out.println("Craeted a User");
		//Assert.fail();
	}
	
	@Test(priority = 1)
	public void modifyUser() {
	//	throw new SkipException("skipped");
		System.out.println("Modified User");
		//Assert.fail();
	}
	
	@Test(invocationCount = 3,priority = 2)
	public void deleteUser() {
		System.out.println("Deleted User");
		//Assert.fail();
	}

}
