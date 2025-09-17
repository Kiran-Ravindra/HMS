package apt.qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement day= driver.findElement(By.id("day"));
		Select s1= new Select(day);
		s1.selectByIndex(0);
		s1.selectByValue("22");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2= new Select(month);
		s2.selectByValue("7");
		s2.selectByVisibleText("Aug");
		
		WebElement year= driver.findElement(By.id("year"));
		Select s3= new Select(year);
		s3.selectByValue("1997");
		
	
		driver.quit();
		

	}

}
