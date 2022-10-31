package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class ListernImpl implements ITestListener {
	
	@Override
	public  void onTestStart(ITestResult result) {
	  System.out.println("----------------------------------------");
	  
	  System.out.println(" The Testcase is Sucessfull"+ result.getName());
	  
	  System.out.println("-----------------------------------------");
	  
		
	  }

	  	@Override
	  public void onTestSuccess(ITestResult result) {
	  		 System.out.println("----------------------------------------");
	  		  
	  		  System.out.println(" The Testcase is Sucessfull"+ result.getName());
	  		  
	  		  System.out.println("-----------------------------------------");
	  		  
	  }

	  
	@Override
	 public void onTestFailure(ITestResult result) {
		 System.out.println("----------------------------------------");
		  
		  System.out.println(" The Testcase is Sucessfull"+ result.getName());
		  
		  System.out.println("-----------------------------------------");
		  ScreenShortsEX2 obj = new ScreenShortsEX2();
		  
		  try {
			obj.screenshort();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		  
	  }

	  
	
	}
	
	
	
	
	
	
	
	
	
	
	
	


