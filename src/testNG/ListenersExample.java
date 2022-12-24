 package testNG;
 import org.testng.ITestListener; 
 import org.testng.ITestContext; 
 import org.testng.ITestResult;
 
  public class ListenersExample implements ITestListener {
  
 @Override 
 public void onTestStart(ITestResult result)
 {System.out.println("test case is going to be executed");}
  
 @Override
 public void onTestSuccess(ITestResult result) 
 { System.out.println("test case passed");}

 @Override
 public void onTestFailure(ITestResult result)
 {System.out.println("test case failed");}
 
 @Override 
 public void onTestSkipped(ITestResult result) 
 {System.out.println("test case  skipped");}
  
 @Override
 public void onTestFailedButWithinSuccessPercentage(ITestResult result)
 {System.out.println("test case  failed with percentage");}
 
 @Override 
 public void onTestFailedWithTimeout(ITestResult result)
 { System.out.println("test case failed with timeout"); }
 
 public void onStart(ITestResult result)
 {System.out.println("before everything");}
  
 
 public void onFinish(ITestResult result) 
 {System.out.println("after everything");}
 
 
  }
 
  