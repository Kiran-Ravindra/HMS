package com.testng.annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class customer extends BaseClass {
	
	// WebDriver driver;
	
	@AfterClass(groups = "SmokeTest")
	public void logout() {
		Reporter.log("Logout",true);
	//	driver.quit();
	}
	
	@BeforeClass(groups = "SmokeTest")
	public void login() {
		
	//	driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	driver.get("https://www.facebook.com");
		Reporter.log("Login",true);
	}
	
	@Test(groups = "SmokeTest")
	public void createCustomer() {
		Reporter.log("Created a Customer",true);
	}
	@Test(groups = "RegressionTest")
	public void modifyCustomer() {
		
		Reporter.log("Modified the customer",true);
	}
	@Test(groups = "RegressionTest")
	public void deleteCustomer() {
		Reporter.log("Deleted the customer",true);
		
	}

}
