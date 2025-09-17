package actions.mouse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_4_elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://demoapps.qspiders.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver1.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
        WebElement webElements=driver1.findElement(By.xpath("//section[text()='Web Elements']"));
        webElements.click();
        
        WebElement mouseActions= driver1.findElement(By.xpath("//section[text()='Mouse Actions']"));
        
        Actions action = new Actions(driver1);
        action.scrollToElement(mouseActions).perform();
        mouseActions.click();
        
        driver1.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
        Thread.sleep(2000);
        driver1.findElement(By.xpath("//a[text()='Drag Position']")).click();
        
       // WebElement mobileAccAddress= driver1.findElement(By.id("dropZone1"));
        WebElement mobileAccAddress= driver1.findElement(By.xpath("//div[text()='Mobile Accessories']"));
      //  WebElement laptopAccAddress= driver1.findElement(By.id("dropZone2"));
        WebElement laptopAccAddress= driver1.findElement(By.xpath("//div[text()='Laptop Accessories']"));
        
        
       List<WebElement> listaccessories_address = driver1.findElements(By.xpath("//div[@class='draggable']"));
       
       Actions a = new Actions(driver1);
       
       for(WebElement ele: listaccessories_address)
       {
    	   
    	   
    	   if(ele.getText().contains("Mobile"))
    	   {
    		   System.out.println(ele.getText()+" Moving to Mobile Section");
    	      // a.dragAndDrop(ele, mobileAccAddress).perform();
    	       a.clickAndHold(ele).moveToElement(mobileAccAddress).release().build().perform();
    	       Thread.sleep(2000);
    	   }
    	   else
    	   {
    		   System.out.println(ele.getText()+" Moving to Laptop Section");
    	        a.dragAndDrop(ele, laptopAccAddress).perform();
    	        Thread.sleep(2000);
    	   }
    	  
    	   
    	   
       }
        
        
        
        
        
        
        
	}

}
