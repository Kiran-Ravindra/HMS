package apt.qsp;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium1 {

	public static void main(String[] args)  {

	
	ChromiumDriver driver=	new EdgeDriver();
	
	driver.get("http://www.facebook.com");
	
	String url= driver.getCurrentUrl();
	String title=driver.getTitle();
	

	System.out.println("url is "+url);
	System.out.println("Title is  "+title);
	
    //Thread.sleep(2000);
	
	driver.close();
    
	}

}
