package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
	static {
	System.setProperty("webdriver.chorme.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Neeraj/Desktop/demo.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		
	}

}
