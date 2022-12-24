package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoDemoFileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");

		WebElement uploadButton=driver.findElement(By.xpath("//input[@id='input-4']"));
		//new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-4']"))).click();
		uploadButton.sendKeys("C:\\Users\\Reka\\Desktop\\New\\file-sample_150kB.pdf");
		
		
		/* REKA  not working
		//WebElement filePreview=driver.findElement(By.xpath("//*[@id=\'preview-1669041085795-0\']"));
		String titleName=driver.getTitle();
		if (titleName.equals("file-sample_150kB.pdf"))
			System.out.println("file uploaded");
			break;	
		*/
		
		/*
		//Learn automation online not working
		uploadButton.click();
		String file="C:\\Users\\Reka\\Desktop\\New\\file-sample_150kB.pdf";
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/		
	}
}
