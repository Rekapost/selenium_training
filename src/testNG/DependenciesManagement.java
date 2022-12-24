package testNG;
import org.testng.annotations.Test;
public class DependenciesManagement {
	
	//Problem 1: u have to admit a student to Engineering
	//Problem 2: u have to admit student to higher Secondary
	@Test(enabled=true)
	public void middleSchool() {
		System.out.println("middle school");	
	}
	
	@Test(dependsOnMethods = "middleSchool")
	public void highSchool() {
		System.out.println("high school");	
	}
	
	@Test(dependsOnMethods ="highSchool" )
	public void engineerin() {
		System.out.println("engineering college");	
	}

}



//////    xml file <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >