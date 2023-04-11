package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver","F:\\java\\Automation\\driver\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.instagram.com");
 String	title=driver.getTitle();
  System.out.println(title);
	//driver.close();
}
}