package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAlloption {
static {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
}
	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/Neeraj/Desktop/selenium/multipleselect.html");
	 WebElement mtrListbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	String text = s.getWrappedElement().getText();
	System.out.println(text);
	

	}

}
