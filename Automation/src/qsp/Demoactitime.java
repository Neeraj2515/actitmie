package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoactitime {
static {
	System.setProperty("webdriver.chrome.driver","driver/Chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Read Service Agreement']")).click();
		Thread.sleep(3000);
		Set<String> wh = driver.getWindowHandles();
		int count=wh.size();
		System.out.println(count);
		for(String agtab:wh)
		{
			driver.switchTo().window(agtab);
		}
		List<WebElement>alllinks=driver.findElements(By.xpath("//h2"));
		for(WebElement handle:alllinks)
		{
		
			//String text = alllinks.get("handle").getText();
			System.out.println(handle.getText());
		}
	}

}


























