package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHeroRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		WebElement uncheckedButton=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		boolean text=uncheckedButton.isSelected();
		System.out.println(text);
		
		WebElement checkedButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		boolean text2=checkedButton.isSelected();
		System.out.println(text2);
		
		WebElement ageSelect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		ageSelect.click();
	
	}
	

}
