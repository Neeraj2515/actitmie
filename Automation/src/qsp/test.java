package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.Filelib1;

public class test
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws IOException, InterruptedException
{
	WebDriver driver =new ChromeDriver();
	Thread.sleep(3000);
       driver.get("https://www.seleniumhq.org");
       String tile = driver.getTitle();
       System.out.println(tile);
      String data = driver.getCurrentUrl();
      driver.manage().window().maximize();
      if(data.equals("https://www.selenium.dev/"))
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("false");
      }
 
     
//	Filelib1 f=new Filelib1();
//	String value1 = f.getPropertyData("URL");
//	String value2 = f.getPropertyData("USERNAME");
//	String value3 = f.getPropertyData("PASSWORD");
//	System.out.println(value1);
//	WebDriver driver=new ChromeDriver();
//	driver.get(value1);
//	driver.findElement(By.id("username")).sendKeys(value2);
//	driver.findElement(By.name("pwd")).sendKeys(value3);
//	driver.findElement(By.xpath("//div[text()='Login ']")).click();;
//	
	
	
	//System.out.println(value1);
	// String value2 = f.getExcell1("CreateCustomer", 1, 2);
	// f.multipleData("name1", 1, 0);
}
}

