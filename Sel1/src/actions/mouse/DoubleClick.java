package actions.mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://demoapps.qspiders.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver1.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver1.findElement(By.xpath("//section[text()='Button']")).click();
		driver1.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement yes= driver1.findElement(By.id("btn_a"));
		
		Actions action = new Actions(driver1);
		action.doubleClick(yes).perform();
		
		WebElement element= driver1.findElement(By.xpath("//button[text()='Yes']/following-sibling::span"));
		System.out.println(element.getText());
		

	}

}
