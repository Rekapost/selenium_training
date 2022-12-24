package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameters("Name")
	public void printName(String name) {
		//System.out.println("name is :"+ "Reka");
		System.out.println("name is :"+ name);
	}
	
	@Parameters({ "browserName", "userName", "Password"})
	@Test 
	public void Vijayabharathitest ( String browserName,  String userName, String password) {
		
		System.out.println("browsername is "+browserName);
		System.out.println("User name is "+userName);
		System.out.println("Password is "+password);
		
	}		

}
