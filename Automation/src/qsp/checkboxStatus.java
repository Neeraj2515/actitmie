package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxStatus {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	String present = driver.findElement(By.id("keepLoggedInCheckBox")).getText();
	System.out.println("present");
	driver.close();
	
	}

}
