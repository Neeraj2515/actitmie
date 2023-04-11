package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAlldropdownbutton {
private static final int Jul = 0;
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String []args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	WebElement datelistBox = driver.findElement(By.id("day"));
	Select s1=new Select(datelistBox);
	s1.selectByIndex(6);
	WebElement monthListbox = driver.findElement(By.id("month"));
	Select s2=new Select(monthListbox);
	s2.selectByIndex(Jul);
	Thread.sleep(3000);
	WebElement yearListBox = driver.findElement(By.id("year"));
	Select s3=new Select(yearListBox);
       s3.selectByIndex(67);
}

}






















