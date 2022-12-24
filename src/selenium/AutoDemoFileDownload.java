package selenium;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoDemoFileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();	
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(3000);
		WebElement downloadFile=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		//wait.until(ExpectedConditions.elementToBeClickable(DownloadFile));
		downloadFile.click();
		File fileLocation=new File("C:\\Users\\Reka\\Downloads");
		File[] totalFiles=fileLocation.listFiles();		
		for (File eachfile : totalFiles)
		{
		if (eachfile.getName().equals("samplefile.pdf"));
		System.out.println("file downloaded");
		break;
		}						
		driver.close()	;
	}	
}

