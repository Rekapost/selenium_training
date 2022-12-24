package testNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierarchyExamples {
  @Test
  public void test() {
	  System.out.println("i am Test ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am before Method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am after Method ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am before Class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am after Class ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am before Test ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am after Test ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am before Suite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am after Suite ");
  }

}
