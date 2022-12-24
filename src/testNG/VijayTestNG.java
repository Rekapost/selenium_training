package testNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	
public class VijayTestNG {
		
		@BeforeGroups (groups = {"smoke"})
		public void beforeGroup() {
			System.out.println("I am exeuting before group of Smoke");
		}
		
		@AfterGroups(groups = {"smoke"})
		public void AfterGroup() {
			System.out.println("I am exeuting After group of Smoke");
		}
		
		@BeforeGroups (groups = {"sanity","bharathi"})
		public void beforeGroupSanity() {
			System.out.println("I am exeuting before group of sanity, bharathi");
		}
		
		@AfterGroups(groups = {"sanity", "bharathi"})
		public void AfterGroupSanity() {
			System.out.println("I am exeuting After group of sanity, bharathi");
		}
		
		@Test (groups = {"smoke", "bharathi"})
		public void test005() {
			System.out.println("I am executing test case 001");
			Reporter.log("I am executing test case 001");
			
			int a=10;
			int b=9;
			AssertJUnit.assertEquals(a>b, b>a);
		}
		@Test(groups = {"vijay", "sanity", "bharathi"})
		public void test002() {
			System.out.println("I am executing test case 002");
			Reporter.log("Vijayabharathi is executing this test case");
		}
		@Test (groups = {"bharathi", "smoke", "sanity"})
		public void test003() {
			System.out.println("I am executing test case 003");
			Reporter.log("I am executing test case 003");
		}

		@Test
		public static void testCase() {
			System.out.println("I am the Testcase");
		}
		
		@Parameters({ "browserName", "userName", "Password"})
		@Test 
		public void Vijayabharathitest ( String browserName,  String userName, String password) {
			
			System.out.println("browsername is "+browserName);
			System.out.println("User name is "+userName);
			System.out.println("Password is "+password);
			
		}		


	@BeforeTest (groups = {"smoke"})
	public void BeforeTest(){
		System.out.println("I am executing before any test method");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("I am executing After all test method");

	}
	@BeforeClass
	public void BeforeClass(){
		System.out.println("I am executing before every class");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("I am executing After every class");

	}
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("I am executing before every suite");
	}

	@AfterSuite
	public void AfterSuite(){
		System.out.println("I am executing After every suite");

	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am exeuting before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am exeuting after every method");
	}




}
