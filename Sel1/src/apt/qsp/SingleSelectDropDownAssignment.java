package apt.qsp;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
        Thread.sleep(2000);
        
      
        WebElement countryCode=driver.findElement(By.id("country_code"));
        Select s1= new Select(countryCode);
        s1.selectByValue("+91");
        Thread.sleep(2000);
        
        WebElement countryName=driver.findElement(By.id("select3"));
        Select s2= new Select(countryName);
        s2.selectByValue("India");
        Thread.sleep(2000);
        
        WebElement stateName=driver.findElement(By.id("select5"));
        Select s3= new Select(stateName);
        s3.selectByValue("Karnataka");
        Thread.sleep(2000);
        
        
        WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
        Select s4 = new Select(city);
        s4.selectByVisibleText("Mandya");
        Thread.sleep(2000);
        
        WebElement quantity=driver.findElement(By.id("select7"));
        Select s5= new Select(quantity);
        s5.selectByValue("5");
        Thread.sleep(2000);
        
        driver.findElement(By.id("continuebtn")).click();
        
        
        
        
        driver.quit();
        
        
	}

}
