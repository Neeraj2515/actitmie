package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDat {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/test.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
	 int count = wb.getSheet("name1").getLastRowNum();	
	    for(int i=0;i<=count;i++)
	   {
	     String un = wb.getSheet("name1").getRow(i).getCell(0).getStringCellValue();
	    String pw = wb.getSheet("name1").getRow(i).getCell(1).getStringCellValue();
	   System.out.println(un+""+pw);
	   
	  
	}

}
}
