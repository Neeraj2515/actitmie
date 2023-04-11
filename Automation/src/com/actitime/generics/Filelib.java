package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * generic class for data driven testing
 * @author Neeraj
 *
 */
public class Filelib {
/**
 * generic method to read data driven file 
 * @param key
 * @return String 
 * @throws IOException
 */
	public  String getpropertyvalue(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./data/Commandata.property");
		Properties p=new Properties();
		p.load(fis);
         String value = p.getProperty(key);
		return value;
	}
	/**
	 * generic method to read the data from excel
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelDataValue(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		 return data;
	}
	public void setExcelsheet(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/test1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		  wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		  FileOutputStream fos=new FileOutputStream("./data/test1.xlsx");
		  wb.write(fos);
		  wb.close();
		  
	}
	public String getExcelsheet(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/test1.xlsx");
		    Workbook wb = WorkbookFactory.create(fis);
		    String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		    return data;
	}

}























































































