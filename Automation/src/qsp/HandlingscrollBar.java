package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingscrollBar {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
  WebDriver driver =new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  driver.get("https://www.bbc.com/");
 int Y = driver.findElement(By.xpath("//a[text()=' Global Trade ']")).getLocation().getY();
 JavascriptExecutor j=(JavascriptExecutor)driver;
    j.executeScript("window.scrollBy(0,"+Y+")");
	
	}
}