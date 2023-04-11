package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginEnable {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean text = driver.findElement(By.name("login")).isEnabled();
		if(text==true)
		{
			System.out.print("facebook login button " +"enable");
		}
		else
		{
			System.out.println("facebook login button " +"noenable");
		}
		driver.close();
		
	}

}