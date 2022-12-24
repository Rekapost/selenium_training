package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();	
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		/*WebElement imageclick=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		imageclick.click();
		*/
		
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		//"naturalWidth"=0    broken image
		if (brokenImage.getAttribute("naturalWidth").equals("0"))
		{
		System.out.println("it is broken image");
		}
		else
		{
			System.out.println("it is not a broken image");
		}
	}

}
