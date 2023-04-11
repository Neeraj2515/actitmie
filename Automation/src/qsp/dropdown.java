package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
static {
	System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
}
	public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/#sortable");
	WebElement source = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement target = driver.findElement(By.xpath("//li[text()='Item 3']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(source, target).perform();
	}

}