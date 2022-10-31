package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFaceBook {
	WebDriver driver;
	//String browser = "Chrome";
	@Test
	@Parameters({"browser","username","password"})
	
	public void loginFaceBook(String browser,String username,String password) {
		 
		 
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}else if(browser.equals("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			 driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		else {
			System.out.println(" enter the Correct Browser");
			
		}
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
