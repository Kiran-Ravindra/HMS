package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	
		FileLib fl=new FileLib();
		String url= fl.getdatafromproperty("url");
		String us = fl.getdatafromproperty("us");
		String pwd= fl.getdatafromproperty("pwd");
		
		driver.get(url);
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(us);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		

	}

}
