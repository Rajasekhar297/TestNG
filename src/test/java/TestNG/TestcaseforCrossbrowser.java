package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class TestcaseforCrossbrowser {
	//String browser = "Chrome";
	
	@Test
	@Parameters("browser")
	public void testcaseforCrossbrowser(String browser) {
		
		
		if(browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
	
		driver.findElement(By.linkText("Themes")).click();
		
		
		}
		
		else if(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/");
			
			driver.findElement(By.linkText("Support")).click();
		}
		
		else {
			
			System.out.println("Enter the correct Browser");
			
		}
		
		
		
		
		
	}
	
	

}
