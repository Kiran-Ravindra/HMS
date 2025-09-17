package popups;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		
		String myNumber="96112943145";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement policyNo= driver.findElement(By.id("policynumber"));
		policyNo.click();
		policyNo.sendKeys("123A");
		
		WebElement dob = driver.findElement(By.id("dob"));
		dob.click();
		Thread.sleep(5000);
//		
//		  WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
//	        Select s4 = new Select(city);
//	        s4.selectByVisibleText("Mandya");
//	        Thread.sleep(2000);
		
		
		//WebElement yearSelect =driver.findElement(By.xpath("//select[@aria-label='Select year'])"));
		WebElement yearSelect=driver.findElement(By.className("ui-datepicker-year"));
		Select s1 = new Select(yearSelect);
		s1.selectByVisibleText("1997");
		Thread.sleep(2000);
		
		//WebElement monthSelect =driver.findElement(By.xpath("//select[@aria-label='Select month'])"));
		WebElement monthSelect=driver.findElement(By.className("ui-datepicker-month"));
		Select s = new Select(monthSelect);
		s.selectByVisibleText("Aug");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
		
		WebElement phNo= driver.findElement(By.id("alternative_number"));
		phNo.click();
		phNo.sendKeys(myNumber);

		
		driver.findElement(By.id("renew_policy_submit")).click();
		String text= driver.findElement(By.id("policynumberError")).getText();
		System.out.println(text);
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
