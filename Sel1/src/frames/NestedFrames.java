package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		
		//driver.switchTo().parentFrame();
		 Thread.sleep(2000);
		driver.switchTo().frame(0);
		
    	String defaultEmail=driver.findElement(By.xpath("//p[text()='Default Email']/following-sibling::p[1]")).getText();
	    String defaultPassword=	driver.findElement(By.xpath("//p[text()='Default Password']/following-sibling::p[1]")).getText();
	    String defaultConfirmPassword=	driver.findElement(By.xpath("//p[text()='Default Confirm Password']/following-sibling::p[1]")).getText();
		
	   
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.id("email")).sendKeys(defaultEmail);
	    driver.findElement(By.id("password")).sendKeys(defaultPassword);
	    driver.findElement(By.id("confirm-password")).sendKeys(defaultConfirmPassword);
	    
	    driver.findElement(By.id("submitButton")).click();
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	    
	    
	    
	   // System.out.println(defaultConfirmPassword);
	    
	
	}

}
