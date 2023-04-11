package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFsoption {
static {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Neeraj/Desktop/selenium/multipleselect.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		WebElement fsoption = s.getFirstSelectedOption();
		String text = fsoption.getText();
		System.out.println(text);
		
		
	}

}
