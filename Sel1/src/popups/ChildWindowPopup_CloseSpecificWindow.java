package popups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup_CloseSpecificWindow {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Window to close Google or Apple ");
		String browser=scn.next();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://secure.indeed.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window:windows) {
		
			driver.switchTo().window(window);
			
			if(driver.getTitle().contains(browser))
			{
				break;
			}
			driver.close();
			
		
			
		
			
		}
		
		
	
		


	}

}
