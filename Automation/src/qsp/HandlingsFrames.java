package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingsFrames {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Neeraj/Desktop/Page3.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jsp");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("qsp");
		
		
	}

}




















