package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/DataDrivenExcel.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		
		int lastrow=wb.getSheet("MultipleData").getLastRowNum();
	
		
	//	System.out.println(lastrow);
		
		for(int i=0;i<=lastrow;i++)
		{
			 String celldata= wb.getSheet("MultipleData")
					.getRow(i).getCell(0).getStringCellValue();
			  
			  System.out.println(celldata);	
		}
		
		short colsize= wb.getSheet("MultipleData").getRow(0).getLastCellNum();
		
		for(int j=0;j<colsize;j++)
		{
			String s=wb.getSheet("MultipleData").getRow(0).getCell(j).getStringCellValue();
			System.out.print(s);
		}
		
		System.out.println("matrix");
		for(int i=0;i<=lastrow;i++) {
			
			short each_col_size=wb.getSheet("MultipleData").getRow(i).getLastCellNum();
			
			for(int j=0;j<colsize;j++) {
				
				String s=wb.getSheet("MultipleData").getRow(i).getCell(j).getStringCellValue();
			//	Cell c= wb.getSheet("MultipleData").getRow(i).getCell(j);
				
				System.out.print(s);
			}
			System.out.println();
		}
      
        
	}

}
