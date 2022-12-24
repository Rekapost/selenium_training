package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void openGoogle() {
	System.setProperty("webdriver.chrome.driver","C://Users//Reka//Drivers//chromedriver.exe/");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.co.in");
	System.out.println("opening google");
	driver.quit();
	}
	
	@Test
	public void openBing()
	{
	System.setProperty("webdriver.chrome.driver","C://Users//Reka//Drivers//chromedriver.exe/");
	WebDriver driver =new ChromeDriver();	
	driver.get("https://www.bing.com/");
	System.out.println("opening Bing");
	driver.quit();
	}
}
