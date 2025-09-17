package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class facebookassertions {
	
	@Test
	public void is_Fb_logo_Displayed() {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("http://www.facebook.com");
	    
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	    boolean isvisible= driver.findElement(By.xpath("//div[@id='content']/div/div/img")).isDisplayed();
		
	    SoftAssert sa = new SoftAssert();
	   // sa.assertFalse(isvisible);
	    sa.assertTrue(isvisible);
		driver.quit();
		sa.assertAll();
		
	}

	@Test
	public void textAssertion() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("http://www.facebook.com");
	    
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	    String actualTxt= driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
		
	    String expectedTxt="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	    
	    org.testng.Reporter.log(expectedTxt,true);
	    org.testng.Reporter.log(actualTxt,true);
	    SoftAssert sa = new SoftAssert();
	    sa.assertEquals(actualTxt, expectedTxt);
		driver.quit();
	    sa.assertAll();
		
		
	}
	

}
