package popups;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopUps {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.id("fullName")).sendKeys("Ivana");
		driver.findElement(By.id("emailId")).sendKeys("ivana@gmail.com");
		driver.findElement(By.id("password")).sendKeys("IVANA@1234");
		driver.findElement(By.id("mobile")).sendKeys("9876543210");
		
		WebElement cityselect =driver.findElement(By.id("city"));
		Select s1= new Select(cityselect);
		s1.selectByVisibleText("Bangalore");
		
//		List <WebElement> multiselectskills= driver.findElements(By.xpath("//label[text()='Enter your skills']/following-sibling::div//select"));
//		
//		for(WebElement e: multiselectskills)
//		{
//			Select s = new Select(e);
//			s.selectByValue(e.getText());
		  //  System.out.println(e.getText());
//			
//		}
		
		WebElement multiselectskills = driver.findElement(By.xpath("//label[text()='Enter your skills']/following-sibling::div//select"));
		
		    Select s = new Select(multiselectskills);
		    
		    if (s.isMultiple()) {
		        s.selectByValue("HTML");
		        s.selectByValue("CSS");
		        s.selectByValue("Javascript");
		        s.selectByValue("Nodejs");
		        s.selectByValue("Express");
		        s.selectByValue("Mongodb");
		    }
		    
		    
		    File f1= new File("./docs/image1.PNG");
		    String absPath = f1.getAbsolutePath();
		    driver.findElement(By.id("resume")).sendKeys(absPath);
		    
		    
		 
		}
	
		
		


	}


