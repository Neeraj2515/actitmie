package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib1 
{
public String getPropertyData(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/commandata.property");
	Properties p=new Properties();
    p.load(fis);
    String value = p.getProperty(key);
    return value;
}
/*public String getExcell1(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/test1.xlsx");
	  Workbook wb = WorkbookFactory.create(fis);
	  String Excell = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return Excell;	
}
public String multipleData(String sheetname,int i,int j ) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/test.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	 int rowcount = wb.getSheet("sheetname").getLastRowNum();
	 for(int i=1;i<rowcount;i++)
	 {
	   String data1 =wb.getSheet("sheetname").getRow(i).getCell(j).getStringCellValue();
	     // Object data = data1.getCell(1).getStringCellValue();
	return data1;
	
}*/
}





















