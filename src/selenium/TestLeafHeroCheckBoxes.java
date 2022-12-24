package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHeroCheckBoxes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		WebElement languageSelect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[4]"));
		languageSelect.click();
		
		WebElement checkedSeleium=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean selected=checkedSeleium.isSelected();
		System.out.println(selected);
		
		WebElement deSelect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		boolean check1=deSelect.isSelected();
		
		WebElement deSelect2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		boolean check2=deSelect.isSelected();
		if (deSelect.isSelected())
		{
			deSelect.click();
		}
		else
			deSelect2.click();
	}	


}
