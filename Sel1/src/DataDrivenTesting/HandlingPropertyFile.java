package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		
		
		String url= p.getProperty("url");
		String un= p.getProperty("us");
		String pwd= p.getProperty("pwd");
		
		//System.out.println("HI");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
	    driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		
		driver.findElement(By.id("loginButton")).click();
	
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	//	driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		
	}

}
