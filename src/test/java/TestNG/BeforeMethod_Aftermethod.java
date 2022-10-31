package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_Aftermethod {
	
	@BeforeMethod
	
	public void setup() {
		
		System.out.println("Welcome");
		
	}
		@Test
		public void Annotation() {
			
			System.out.println("Annotations Practise");
			
		}
	
	@AfterMethod
	public void close() {
		
		System.out.println("Endings");
	
	}
		
	
	
	

}
