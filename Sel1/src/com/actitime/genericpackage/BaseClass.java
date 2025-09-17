package com.actitime.genericpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	
	 @BeforeClass
	  public void OpenBrowser() {
		//  System.out.println(" Open Browser");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("http://localhost:3434/login.do");
		 }
	  
	  @AfterClass
	  public void CloseBrowser() {
		  
		  driver.quit();
		//  System.out.println("Close Browser ");
		
	}
	
@BeforeMethod	
 public void Login() {
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	// System.out.println(" Login");
	
}
 
@AfterMethod
 public void Logout() {
	driver.findElement(By.id("logoutLink")).click();;
	 // System.out.println("Logout ");
	
}
 

}
