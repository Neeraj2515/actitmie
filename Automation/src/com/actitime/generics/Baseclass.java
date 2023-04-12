package com.actitime.generics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public WebDriver driver;
 //@Parameters("browser")
@BeforeClass
public void openbrowser(String browser)
{
	Reporter.log("openbrowser",true);
	//if(browser.equals("chrome"))
	//{
	 driver=new ChromeDriver();
}
// else if(browser.equals("firefox"))
//	{
		//driver=new FirefoxDriver();
//	}
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
//}
@AfterClass
public void closeBrowser()
{
	Reporter.log("closeBrowser",true);
	driver.close();
}
@BeforeMethod
public void login()
{
	Reporter.log("login",true);
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutLink")).click();
}
}

















