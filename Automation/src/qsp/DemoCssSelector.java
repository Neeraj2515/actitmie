package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {
		static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Neeraj/Desktop/neeraj.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.findElement(By.cssSelector("a[name='h1']"));
		driver.findElement(By.className("a[class='c1']")).click();
		driver.findElement(By.className("a[href='https://jspiders.com']")).click();
	}
	

}
