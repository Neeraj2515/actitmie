package jsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
  public void data()
{
Reporter.log("Createcustomer",true);
	}
	@Test
	  public void data1()
	{
	Reporter.log("Modifycustomer",false);
		}
	@Test
	  public void data2()
	{
	Reporter.log("deletecusomer");
		}
}
