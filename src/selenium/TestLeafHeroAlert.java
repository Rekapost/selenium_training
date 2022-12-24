package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHeroAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		//ok alert
		WebElement okalert=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		okalert.click();
		Alert alertwindow=driver.switchTo().alert();
		//Thread.sleep(3000);
		alertwindow.accept();
		
		WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert alertwindow1=driver.switchTo().alert();
		alertwindow1.dismiss();
		
		WebElement promptBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptBox.click();
		Alert alertwindow2=driver.switchTo().alert();		
		alertwindow2.sendKeys("selenium");
		alertwindow2.accept();
		
		WebElement lineBreaks=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
		lineBreaks.click();
		Alert alertwindow3=driver.switchTo().alert();
		String lineBreaklines=alertwindow3.getText();
		System.out.println(lineBreaklines);	
		alertwindow3.accept();
		
	}

}
