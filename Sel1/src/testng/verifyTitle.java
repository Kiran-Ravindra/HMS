package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.Test;

public class verifyTitle {
	@Test
	public void verifyTile() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.google.com");
		String expected_Title="Google";
		String actual_Title=driver.getTitle();
		
		if(actual_Title.equals(expected_Title)) {
		//	Reporter.lo
		}
		
	}

}
