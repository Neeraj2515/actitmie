package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleselectListbox {
	static {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	}
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Neeraj/Desktop/selenium/multipleselect.html");
		  WebElement MtrListbox = driver.findElement(By.id("mtr"));
		  Select s=new Select(MtrListbox);
		  Thread.sleep(3000);
		  List<WebElement> allsListoption = s.getAllSelectedOptions();
		      int text = allsListoption.size();
		       System.out.println(text);
		/*  s.selectByIndex(5);
		  s.selectByValue("c");
		  s.selectByVisibleText("voda pav");
		  s.deselectByIndex(5);
		 System.out.println(s.isMultiple());*/
		  
	}
	
	}
































