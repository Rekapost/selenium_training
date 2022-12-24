package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHeroLinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
		
		WebElement homePage=driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();
		
		driver.navigate().back();
		WebElement WhereToGoWithoutClickingMe=driver.findElement(By.partialLinkText("Find where am supposed to go"));
		String wheretogo=WhereToGoWithoutClickingMe.getAttribute("href");
		System.out.println("this link is going to :  "+ wheretogo);
		
		WebElement findBrokenLink=driver.findElement(By.linkText("Verify am I broken?"));
		findBrokenLink.click();
		String brokenLink=driver.getTitle();
		if (brokenLink.contains("404"))
		{
			System.out.println("link is broken");
		}
		
		driver.navigate().back();
		//stale element reference exception, as page has refreshed and reloaded,so find the element again and then click
		
		WebElement homePage1=driver.findElement(By.linkText("Go to Home Page"));
		homePage1.click();
		driver.navigate().back();
		
		List<WebElement> totalLinks= driver.findElements(By.tagName("a"));
		int noOfLinks=totalLinks.size();
		System.out.println(noOfLinks);
		
	}
	
	

}
