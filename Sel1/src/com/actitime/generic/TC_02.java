package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		FileLib fl = new FileLib();
		String url = fl.getdatafromproperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		FileInputStream fis = new FileInputStream("./data/DataDrivenExcelNew1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastrow = wb.getSheet("actitime").getLastRowNum();
		System.out.println("The last row is " + lastrow);

		for (int i = 0; i <= lastrow; i++) {

			short lastcellnum = wb.getSheet("actitime").getRow(i).getLastCellNum();
			System.out.println("the column count of row " + (i + 1) + "is" + lastcellnum);

			String un = fl.getDataFromExcel(wb, "actitime", i, 0);
			String pwd = fl.getDataFromExcel(wb, "actitime", i, 1);

			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(4000);

			int size = driver.findElements(By.id("logoutLink")).size();

			if (size > 0) {

				 
				fl.setDataToExcel(wb, "actitime", i,i+2,"Pass");
			//	wb.getSheet("actitime").getRow(i).createCell(4).setCellValue("Passs");
				System.out.println("PASS");
				driver.findElement(By.id("logoutLink")).click();
			}

			else {
				
				System.out.println("FAIL");
				fl.setDataToExcel(wb, "actitime", i, i+2,"Fail");
			//	wb.getSheet("actitime").getRow(i).createCell(4).setCellValue("Fails");
				driver.findElement(By.name("username")).clear();
				driver.findElement(By.name("pwd")).clear();

			}

			FileOutputStream fos = new FileOutputStream("./data/DataDrivenExcelNew1.xlsx");
			wb.write(fos);

		}
		wb.close();
	}
}
