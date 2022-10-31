package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.framework.function.core.BaseTest;

public class TestListener  implements ITestListener{
	
	@Override
	public  void onTestStart(ITestResult result) {
	  System.out.println("----------------------------------------");
	  
	  System.out.println(" The Testcase is Sucessfull"  +   result.getName());
	  
	  System.out.println("-----------------------------------------");
	  
		
	  }

	  	@Override
	  public void onTestSuccess(ITestResult result) {
	  		 System.out.println("----------------------------------------");
	  		  
	  		  System.out.println(" The Testcase is Sucessfull"  +  result.getName());
	  		  
	  		  System.out.println("-----------------------------------------");
	  		
	  }

	  
	@Override
	 public void onTestFailure(ITestResult result) {
		 System.out.println("----------------------------------------");
		  
		  System.out.println(" The Testcase is Unsucessfull"+ result.getName());
		  
		  System.out.println("-----------------------------------------");
		  
		  
		  BaseTest.captureScreenshot();
		  
		  
		}
		  
}


