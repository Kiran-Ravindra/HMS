package com.google.takesScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	  WebDriver driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  //Taking a screenshot of a web page
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File src= ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./screenshots/img.png");
	  FileUtils.copyFile(src, dest);
	  
	  
	 //Taking a screenshot of a web element
	  
	 WebElement google_locator=  driver.findElement(By.cssSelector("svg[aria-label='Google']"));
	 src= google_locator.getScreenshotAs(OutputType.FILE);
	 dest = new File("./screenshots/img1.png");
	  FileUtils.copyFile(src, dest);
	  
	  driver.quit();
	
	  
	 
	  
	  
	}

}
