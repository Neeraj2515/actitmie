package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage 
{
private WebElement untbx;
private WebElement pwtbx;
private WebElement lgtbx;
public Loginpage(WebDriver driver)
{
	untbx=driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.name("pwd"));
	lgtbx=driver.findElement(By.xpath("//div[text()='Login ']"));
}
public void setusername(String un)
{
    untbx.sendKeys(un);   
}
public void setpassword(String pw)
{
	  pwtbx.sendKeys(pw);
	  lgtbx.click();
	
}
}

















