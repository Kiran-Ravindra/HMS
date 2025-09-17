package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//We are converting high level data into low level data
				FileInputStream fis = new FileInputStream("./data/DataDrivenExcel.xlsx");
				//create(fis) will create workbook interface type object and also load the low level data into the workbook
			   
				Workbook wb= WorkbookFactory.create(fis);
			     String name= wb.getSheet("employee").getRow(1).getCell(1).getStringCellValue();
				 System.out.println(name);
				 
				 wb.getSheet("employee").getRow(2).createCell(3).setCellValue("456");
				 
				// wb.createSheet("student").createRow(0).createCell(0).setCellValue("RCB");
				 FileOutputStream fos = new FileOutputStream("./data/DataDrivenExcel.xlsx");
				 wb.write(fos);
				 wb.close();
				

	}

}
