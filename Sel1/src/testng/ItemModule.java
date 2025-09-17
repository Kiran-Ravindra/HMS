package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ItemModule {
	
	@Test(priority = 0)
	public void createItem() {
		
		System.out.println("Craeted an Item");
	//	Assert.fail();
	}
	
	@Test(priority = 1)
	public void modifyItem() {
	//	throw new SkipException("skipped");
		System.out.println("Modified Item");
		Assert.fail();
	}
	
	@Test(invocationCount = 3,priority = 2)
	public void deleteItem() {
		System.out.println("Deleted Item");
		Assert.fail();
	}



}
