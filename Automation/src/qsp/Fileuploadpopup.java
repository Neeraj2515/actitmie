package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
 public static void main(String []args) throws InterruptedException
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.naukri.com/mnjuser/pendingAction");
	// driver.findElement(By.id("login_Layer")).click();
	 Thread.sleep(3000);
	driver.findElement(By.id("usernameField")).sendKeys("neerajmaurya212@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("Neeraj2");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[contains(@class,'nI-gNb-drawer')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
     Thread.sleep(2000);
	 File f=new File("./data/NEERAJ RESUME-converted (1).docx");
	 Thread.sleep(3000);
		String absoulte = f.getAbsolutePath();	
		 Thread.sleep(3000);
			driver.findElement(By.id("attachCV")).sendKeys(absoulte);
		
 }
}