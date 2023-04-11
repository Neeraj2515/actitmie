package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Neeraj/Desktop/Page3.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("d");
	
	}

}
