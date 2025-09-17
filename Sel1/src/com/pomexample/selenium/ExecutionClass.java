package com.pomexample.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	 driver.get("https://online.actitime.com/tyss/login.do");
	 Thread.sleep(5000);
	 
	 LoginPagePOM l= new LoginPagePOM(driver);
	 l.setLogin("admin1", "password");
	 
	 Thread.sleep(2000);
	 
	 l.setLogin("admin", "manager");
	

	}

}
