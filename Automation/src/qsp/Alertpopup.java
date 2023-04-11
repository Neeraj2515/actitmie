package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//driver.switchTo().alert().dismiss();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("i am a boy");
		driver.switchTo().alert().accept();

	}

}





























