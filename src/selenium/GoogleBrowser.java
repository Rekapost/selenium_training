package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Agni"+ Keys.ENTER);
		driver.close();
		
	}
}