package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelfile2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("‪‪./data/test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	    String data = wb.getSheet("name").getRow(1).getCell(1).getStringCellValue();
        System.out.println(data);
	}

}
