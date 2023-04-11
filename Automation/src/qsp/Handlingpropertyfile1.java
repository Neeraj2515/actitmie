package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpropertyfile1 {
	static {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	}
public static void main(String []arg) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/Commandata.property");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("URL");
	String un = p.getProperty("USERNAME");
	String pw = p.getProperty("PASSWORD");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pw);
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	
	
}
}

















