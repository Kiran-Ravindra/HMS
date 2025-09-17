package apt.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		ChromiumDriver driver=	new EdgeDriver();
		
		driver.get("C:\\Users\\kravindra\\Documents\\Java Programs\\qsp.html");
		
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();

	    driver.navigate().forward();
	    
	    driver.navigate().back();
		
	    driver.navigate().to("http://www.instagram.com");
	    
	    driver.navigate().refresh();
	    
		String actual_title=driver.getTitle();
		
       String expected_title= "instagram";
	
		System.out.println("Title is  "+actual_title);
		
		if(actual_title.contains(expected_title))
		{
			System.out.println("Title is verified and good to go");
		}
		else
		{
			System.out.println("Invalid Page");
		}
		
		String currenturl =driver.getCurrentUrl();
		System.out.println("The Current url is "+currenturl);
		
		driver.manage().deleteAllCookies();
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	
		
		driver.quit();
	    

	}

}
