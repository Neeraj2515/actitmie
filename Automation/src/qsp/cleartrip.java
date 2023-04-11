package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("BLR - Bangalore, IN");
	driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("GOI - Goa, IN");
	driver.findElement(By.linkText("//span[text()='Search flights']")).click();
	}

}
