package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopu2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String []args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();;
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  driver.switchTo().alert().dismiss();
	 String text = driver.findElement(By.id("demo")).getText();
	 System.out.println(text);
}
	

}













