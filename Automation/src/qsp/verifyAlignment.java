package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x1=driver.findElement(By.name("email")).getLocation().getX();
		int x2=driver.findElement(By.name("pass")).getLocation().getX();
		if(x1==x2)
		{
			System.out.println("username and password  textbox is propertly allignment and password");
		}
		else
		{
			System.out.println("username and password  textbox is  not propertly allignment and password");
		}
	}

}
