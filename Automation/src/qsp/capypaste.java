package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capypaste {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
  public static void main(String []args)
{
	  WebDriver Driver=new ChromeDriver();
	 Driver.get("file:///C:/Users/Neeraj/Desktop/selenium/Demo3.html");
	 Driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.CONTROL+"ac");
	 Driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+"av");
	  
}




}