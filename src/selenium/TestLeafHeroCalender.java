package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHeroCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();	
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		WebElement calender=driver.findElement(By.id("datepicker"));
		
		// or calender.sendKeys("08/15/2023"+Keys.ENTER);
		
		calender.click();
		WebElement Next=driver.findElement(By.xpath("//a[@title='Next']"));
		Next.click();
		WebElement tenthDay=driver.findElement(By.xpath("//a[contains( text(),'10')]"));
		tenthDay.click();
		
		
	}

}
