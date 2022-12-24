package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();	
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		//html page
		WebElement mainHtml=driver.findElement(By.id("wrapper"));
		
		//iFrame
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"wrapframe\"]/iframe"));
		driver.switchTo().frame(frame);
		//or
		//driver.switchTo().frame(0);
		WebElement inframe=driver.findElement(By.id("Click"));
		inframe.click();
		String textinInnerFrame=inframe.getText();
		System.out.println(textinInnerFrame);
		
		driver.switchTo().defaultContent();
		//WebElement Firstframe=driver.findElement(By.id("wrapframe"));
		//driver.switchTo().frame(Firstframe);
		driver.switchTo().frame(1);
		//WebElement scondFrame=driver.findElement(By.id("frame2"));
		driver.switchTo().frame("frame2");
		WebElement nestedFrame=driver.findElement(By.id("Click1"));
		nestedFrame.click();
		String nestedFrameText=nestedFrame.getText();
		System.out.println(nestedFrameText);
		
		driver.switchTo().defaultContent();
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		int noOfFrame=totalFrames.size();
		System.out.println("NoOfFrames:   "  +noOfFrame);		
		driver.close();
	}

}
