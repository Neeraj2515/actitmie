package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage1 
{
private WebElement untbx;
private WebElement pwtbx;
private WebElement lgtbx;
public loginpage1(WebDriver driver)
{
    untbx=driver.findElement(By.id("username"));
    pwtbx=driver.findElement(By.name("pwd"));
    lgtbx=driver.findElement(By.xpath("//div[text()='Login ']"));
}
public void setlogin(String un,String pwd)
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pwd);
	lgtbx.click();
}
}









