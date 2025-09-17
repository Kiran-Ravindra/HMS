package popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_demoapps {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[contains(text(),'Browser Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New Window')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'Watches')]/following-sibling::button[text()='view more']")).click();
		
	Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> iterateor = windows.iterator();
	
	while (iterateor.hasNext())
	{
		
		driver.switchTo().window(iterateor.next());
	
	     if(driver.getTitle().contains("Luxury Watch"))
	     {
	    	 System.out.println(driver.getTitle());
	    	break; 
	     }
	     
	     driver.close();
	

	}
	}

}
