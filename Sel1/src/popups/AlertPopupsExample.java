package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupsExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("https://demo.automationtesting.in/Alerts.html"));
		driver.findElement(By.className("btn-danger"));
		
		Alert a= driver.switchTo().alert();
		String s= a.getText();
		a.accept();
		System.out.println(s);
		
		
		//Need to Write 2 more selectors
		
		
		driver.quit();
	}

}
