package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcelsheet {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./data/test1.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("user").getRow(1).getCell(0).getStringCellValue();
		 System.out.println(data);
		String data1 = wb.getSheet("user").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);
		String data2 = wb.getSheet("user").getRow(1).getCell(2).getStringCellValue();
			System.out.println(data2);
			WebDriver driver=new ChromeDriver();
			driver.get(data);
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys(data1);
			Thread.sleep(3000);
			driver.findElement(By.name("pwd")).sendKeys(data2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
          
	}

}




































