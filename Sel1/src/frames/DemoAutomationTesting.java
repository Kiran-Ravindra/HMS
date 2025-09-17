package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Iframe with in an Iframe")).click();
		
		
		


	}

}
