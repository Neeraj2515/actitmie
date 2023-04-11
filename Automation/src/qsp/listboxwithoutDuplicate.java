package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxwithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String []args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Neeraj/Desktop/selenium/multipleselect.html");
		 WebElement cpList = driver.findElement(By.id("cp"));
		Select s=new Select(cpList);
		List<WebElement> alloption = s.getOptions();
	
		for(int i=0;i<alloption.size();i++)
		{
			String text = alloption.get(i).getText();
			System.out.println(text);
		}
	}
}











