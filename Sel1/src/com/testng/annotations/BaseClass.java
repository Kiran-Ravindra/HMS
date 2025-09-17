package com.testng.annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;

	@BeforeClass(groups = "SmokeTest")
	public  void openBrowser() {
		
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.facebook.com");
		    Reporter.log("Open Browser",true);
	}
	
	@AfterClass(groups = "SmokeTest")
	public  void closeBrowser() {
		
		driver.quit();
		Reporter.log("CLose Browser",true);
	}
	

}
