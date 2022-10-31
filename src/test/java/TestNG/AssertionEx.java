package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionEx {
	
	WebDriver driver;
	
	@Test
	
	public void assertion() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//open browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//to find the title we will use if Condition
		 String expectedTitle = "OrangeHRM";
		 String actualTitle = driver.getTitle();
		 
		 //assertEquals is the replacement of If Condition 
		 
		 
	     assertEquals(expectedTitle,actualTitle,"Title_Verification");
		 
		
		 
		 /*if(expectedTitle.equals(actualTitle)) {
			 System.out.println("The Title is Pass");
          }else {
			  System.out.println("The Title is Fail");
		 }*/
		
		//Login page
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 WebElement image = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
		 
		System.out.println(image.isDisplayed());
		
		
		WebElement text = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
		
		
		System.out.println(text.getText());
		
		
		
		
	}

	
		
	

}
