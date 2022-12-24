package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafWindowsHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window:  "+parentWindow);
		WebElement homePage=driver.findElement(By.xpath("//*[@id=\'home\']"));
		homePage.click();
		//when u click , u dont know how many windows will open , so loop	
		Set<String> windows=driver.getWindowHandles();
		for (String windowid : windows)
		{
			//to move to newly opened window
			driver.switchTo().window(windowid);	
		}
		
		//newwindow opens , do some opeartion 
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/h5"));
		checkbox.click();
		WebElement languageSelect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[4]"));
		languageSelect.click();
		driver.close();  
		
		//come to main page
		driver.switchTo().window(parentWindow);
		
		WebElement multipleWindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multipleWindow.click();
		int noOfWindows=driver.getWindowHandles().size();
		System.out.println("no of windows opened:"+ noOfWindows);
		
		WebElement doNotCloseme=driver.findElement(By.id("color"));
		doNotCloseme.click();
		Thread.sleep(3000);
		Set<String> noOfwindows=driver.getWindowHandles();
		for (String windowidno : windows)
		{
			//childwindow notequal to parentwindow, so close child window
			//parentwindow equal to parentwindow exit loop
			if (!windowidno.equals(parentWindow))
				{
					driver.switchTo().window(windowidno);
					driver.close();
				}
		}	
		driver.quit();
	}

}
