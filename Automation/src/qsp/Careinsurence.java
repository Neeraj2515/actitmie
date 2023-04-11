package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Careinsurence {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String []args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	Thread.sleep(3000);
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	WebElement monthListbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s1=new Select(monthListbox);
	s1.selectByIndex(6);
	WebElement yearListbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s2=new Select(yearListbox);
	 s2.selectByValue("1995");
	driver.findElement(By.xpath("(//a[@class='ui-state-default'])[25]")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("8546336502");
	driver.findElement(By.id("renew_policy_submit")).click();
	String text = driver.findElement(By.id("policynumberError")).getText();
	System.out.println(text);
}
}














































