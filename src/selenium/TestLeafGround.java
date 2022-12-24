package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement selectToolDropDown=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select selectfrom=new Select(selectToolDropDown);
		selectfrom.selectByIndex(1);
		//Thread.sleep(3000);
		//3 SECS
		//selectfrom.selectByValue(null);
		selectfrom.selectByVisibleText("Playwright");
		
		//to list no of options 
		List<WebElement> listOfOption=selectfrom.getOptions();
		int sizeoflist= listOfOption.size();
		System.out.println(sizeoflist);
		
		//selecting directly by entering the word
		selectToolDropDown.sendKeys("Cypress");
		
		//selecting multiple values from dropdown   		
		WebElement dropArrow=driver.findElement(By.id("j_idt87:auto-complete_input"));
		Select fromdrop=new Select(dropArrow);
		fromdrop.selectByIndex(2);
		fromdrop.selectByValue("4");
		fromdrop.selectByVisibleText("PostMan");
		fromdrop.selectByVisibleText("Appium");
		
		
		
	
	
	
	
	
	
	
	
	}

}
