package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesRowsColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Reka//Drivers//chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> columms=driver.findElements(By.tagName("th"));
		int noOfColumns=columms.size();
		System.out.println("no of columns  :" +noOfColumns );
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int noOfRows=rows.size();
		System.out.println("no of rows  :" +noOfRows );
		
		WebElement progressValue=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent=progressValue.getText();
		System.out.println("percent:" +percent);
		driver.close();
		
		List<WebElement> allProgress= driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberList= new ArrayList<Integer>();
		for (WebElement eachPercent : allProgress) 
		{
			String eachValue=eachPercent.getText().replace("%","");
			numberList.add(Integer.parseInt(eachValue));
		}
		System.out.println("final list"+ numberList);
		
		int smallValue=Collections.min(numberList);
		System.out.println("final list"+ smallValue);
		
		
		String smallValueString=Integer.toString(smallValue)+"%";
		String finalXpath="//td[normalize-space()="+"\""+smallValueString+"\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();	
		
		//"//td[normalize-space()=" + "\"" + smallValueString + "\"" + "]" +  "//following::td[1]"
	}   

}
