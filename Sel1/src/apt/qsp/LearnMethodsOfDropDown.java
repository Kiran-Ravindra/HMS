package apt.qsp;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.time.*;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
public class LearnMethodsOfDropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
	WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
	Select s=new Select(multiSelect);
	//selectByIndex(int index) will select the option by using index which 
	//starts from 0
	s.selectByIndex(0);
	//selectByValue(String value) will select the option by using mentioned
	//value present in value attribute of option tag
	s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
	//selectByVisibleText(Str text) will select the option by using tagText of option tag
	s.selectByVisibleText("Mens Cotton Jacket...");
	//selectByContainsVisibleText(String text) will select the option by using partial 
	//tag text of option tag
	s.selectByContainsVisibleText("Slim Fit");
	//deselectByIndex(int index) will deselect the option by using index which starts from 0
	//s.deselectByIndex(3);Thread.sleep(2000);
	//deselectByValue(String value) will deselect the option by using mentioned value present in value 
	//attribute of option tag
	//s.deselectByValue("Mens Cotton Jacket");Thread.sleep(2000);
	//deselectByVisibleText(text) will deselect the option by using tagText of option tag
	//s.deselectByVisibleText("Mens Casual Premium ...");Thread.sleep(2000);
	//deselectByContainsVisibleText(String text) will deselect the option 
	//by using partial tag text of option tag
	//s.deSelectByContainsVisibleText("Foldsac");
	//deselectAll() will deselect all the selected options
	//s.deselectAll();
	//getFirstSelectedOption() will get the first selected option in listbox,
	//If there is no selected option it will throw NSEE
	WebElement ele = s.getFirstSelectedOption();
	System.out.println("All options are:");
	//System.out.println(ele.getText());
	//getAllSelectedOptions() will get all the selected options in the listbox,
	//If there is no selected options it will return empty list
	List<WebElement> allSel = s.getAllSelectedOptions();
	for(int i=0;i<allSel.size();i++) {
	WebElement sel = allSel.get(i);
	//System.out.println(sel.getText());
	}
	//To print all options in a dropdown
	//getOptions() will return all the options present in the listbox
	List<WebElement> allOpts = s.getOptions();
	for (WebElement oneOpt : allOpts) {
//		System.out.println(oneOpt.getText());
	}
	//isMultiple() is used to check whether the dropdown is multi select or not
	boolean res = s.isMultiple();
	if(res) {
		System.out.println("It is a multi select dropdown");
	}else {
		System.out.println("It is a single selct dropdown");
	}
	//getWrappedElement() is used to wrap all the options into one element
	WebElement wrap = s.getWrappedElement();
	System.out.println(wrap.getText());
	driver.quit();

	}

}
