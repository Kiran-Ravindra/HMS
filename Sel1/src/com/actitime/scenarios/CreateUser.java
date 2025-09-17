package com.actitime.scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:3434/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='USERS']")).click();
		driver.findElement(By.xpath("//div[text()='Add User']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("kiran");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("RK");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kiran1@gmail.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin2");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manager2");
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("manager2");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Time Zone Group']/following::div[1]")).click();
		driver.findElement(By.xpath("//div[@title='London Office']")).click();
		
		System.out.println("London office done");
	driver.findElement(By.xpath("(//div[contains(text(),'Hire Date')])[1]/following::button[1]")).click();
		driver.findElement(By.xpath("//td[@class='x-date-middle']//following::td[@class='x-btn-center']")).click();
		driver.findElement(By.xpath("//a[text()='Aug']")).click();
		driver.findElement(By.xpath("//a[text()='2024']")).click();
		driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
		driver.findElement(By.xpath("(//span[text()='5'])[1]")).click();
		
		
		WebElement checkbox= driver.findElement(By.xpath("//td[@class='setAsDefaultCell']/label/table/tbody/tr/td/input[@type='checkbox']"));
		if(checkbox.isSelected()) {
			checkbox.click();
		}
		Thread.sleep(2000);
		checkbox.click();
		
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[text()='Create User']")).click();
		System.out.println("New User Created");
		driver.quit();

	}

}
