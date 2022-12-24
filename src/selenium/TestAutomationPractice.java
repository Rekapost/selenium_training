package selenium;

import java.awt.dnd.DragSource;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement selectmenu= driver.findElement(By.id("HTML6"));
		WebElement speed= driver.findElement(By.id("speed"));
		speed.click();
		Select fromDropDown=new Select(speed);
		fromDropDown.selectByIndex(1);
		fromDropDown.selectByVisibleText("Fast");
		
		
		WebElement file=driver.findElement(By.id("files"));
		file.click();
		Select fromfilelist=new Select(file);
		fromfilelist.selectByIndex(3);
		fromfilelist.selectByValue("2");
		fromfilelist.selectByVisibleText("DOC file");
		
		WebElement selectnumber=driver.findElement(By.id("number"));
		selectnumber.click();
		Select fromNoList=new Select(selectnumber);
		fromNoList.selectByIndex(3);
		
		WebElement clickalert=driver.findElement(By.xpath("//*[@id=\'HTML9\']/div[1]/button"));
		clickalert.click();
		Alert click=driver.switchTo().alert();
		click.accept();
		Thread.sleep(3000);
		
		WebElement positionofSearch=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		Point xyposition=positionofSearch.getLocation();
		int xValue=xyposition.getX();
		int yValue=xyposition.getY();
		System.out.println("xvalue is:"+xValue+"yvalue is: "+yValue);
		
		WebElement sizeofBox=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		int height=sizeofBox.getSize().getHeight();
		int width=sizeofBox.getSize().getWidth();
		System.out.println("height:" +height+"weight:"+width);
		
		WebElement sourceDrag=driver.findElement(By.xpath("//*[@id=\'draggable\']/p")) ;
		WebElement targetDrop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions  actions=new Actions(driver);
		actions.clickAndHold(sourceDrag).moveToElement(targetDrop).release(targetDrop).build().perform();
		//actions.dragAndDrop(sourceDrag, targetDrop).perform();
		
		//***************************************************************
		
		WebElement centerframe=driver.findElement(By.id("frame-one1434677811"));
		driver.switchTo().frame(centerframe);
		
		WebElement firstName=driver.findElement(By.id("RESULT_TextField-1"));
		firstName.sendKeys("Reka");
		
		WebElement lastName=driver.findElement(By.id("RESULT_TextField-2"));
		lastName.sendKeys("NV");
		
		WebElement phoneNumber=driver.findElement(By.name("RESULT_TextField-3"));
		phoneNumber.sendKeys("12345");
		
		WebElement country=driver.findElement(By.name("RESULT_TextField-4"));
		country.sendKeys("INDIA");
	
		
		WebElement city=driver.findElement(By.id("RESULT_TextField-5"));
		city.sendKeys("pondy");
		
		WebElement mailId=driver.findElement(By.id("RESULT_TextField-6"));
		mailId.sendKeys("abc@gmail.com");
		
		Thread.sleep(30);
		WebElement radioButtonmale=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		//radioButtonmale.click();
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
			//wait.until(ExpectedConditions.elementToBeClickable(radioButtonmale));
		radioButtonmale.sendKeys(Keys.ENTER);
		//radioButtonmale.click();
		//WebElement radioButtonfemale=driver.findElement(By.id("RESULT_RadioButton-7_1"));
		//radioButtonfemale.click();		
		/*
		String gender = "Female";
		if (gender.equals("Male"))
		{
			radioButtonmale.click();
			Thread.sleep(3000);
		}
		else
		{
			radioButtonfemale.click();
			Thread.sleep(3000);
		}
		*/
		
		//WebElement weekday1=driver.findElement(By.id("RESULT_CheckBox-8_1"));
		//weekday1.click();
		//WebElement weekday2=driver.findElement(By.id("//el"));
		//weekday2.click();
		driver.switchTo().defaultContent()	;	 
		
	}

}
