package apt.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search1=driver.findElement(By.name("q"));
		
		search1.sendKeys("iphone 14 pro max ");
		Thread.sleep(2000);
		
	    List<WebElement> elements= driver.findElements(By.xpath("//span[contains(text(),'iphone 14 pro')]/.."));
	
	    
	    System.out.println(elements.size());
	    
	    for(WebElement ele:elements) {
	    	String text= ele.getText();
	    	System.out.println(text);
	    }
	    search1.sendKeys(Keys.ENTER);
	    
	    List<WebElement> mobNames = driver.findElements(By.xpath("//div[contains(text(),'Apple iphone']"));
	    
	    
	    List<WebElement> mobPrices =driver.findElements(By.xpath("//div[contains(text(),'Apple iphone')]/following::div[7]"));
	    
	    for(WebElement ele :mobNames) {
	    	String text =ele.getText();
	    	System.out.println(text);
	    }

		
	
		
		

	}

}
