package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chlidwindowpop {
static {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);

	}

}
