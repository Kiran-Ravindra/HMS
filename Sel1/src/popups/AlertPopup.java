package popups;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import java.time.*;
import java.util.List;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		List<WebElement> webelements=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele: webelements)
		{
			ele.click();
			Thread.sleep(1000);
		}
		
		
		driver.findElement(By.id("deleteButton")).click();
		
		Alert alert=driver.switchTo().alert();
		String s= alert.getText();
		Thread.sleep(2000);
		alert.accept();
		System.out.println(s);
		
		
		driver.quit();
		
		

	}

}
