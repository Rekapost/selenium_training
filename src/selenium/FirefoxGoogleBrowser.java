package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGoogleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Users//Reka//Drivers//geckodriver.exe/");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.quit();
		
	}
}