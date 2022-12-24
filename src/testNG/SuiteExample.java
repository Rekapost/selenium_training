package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void openChrome() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C://Users//Reka//Drivers//chromedriver.exe/");
		driver =new ChromeDriver();		
	}
	
	@Test(priority=1)
	public void openGoogle() {
		driver.get("http://www.google.co.in");
		System.out.println("google url launched");	
	}
	
	@Test(priority=2)
	public void bingOpen() {	
		driver.get("https://www.bing.com/");
		System.out.println("bing launched");	
	}

	@Test(priority=3)
	public void yahooOpen() {
		driver.get("https://www.yahoo.com/");
		System.out.println("yahoo launched");
	}
	
	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("total time"+ totalTime);
	}
}
