package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization_using_XML {
	
	
	//String Login = "Fail";
	
	@Test
	/* Why are we using the Parameters means here if we need to change the username and password 
	 Continuously for the test case it is difficult we need to come to the programe and need to edit 
	 rather than this we use one source is called TestNG.XML (It is used to read the data from XML.
	 to read the data from XML first we need to assign the Variable in the Method.
	(i.e..String username, String pwd) 
	Using this method we can call the data from the XML */ 
	
	@Parameters({"Username","Password"})
	public void parameterization_using_XML(String Username,String Password) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
		WebElement enter = driver.findElement(By.name("login"));
		enter.click();
		/*if(Login == "Fail")
		{
		WebElement obj1 = driver.findElement(By.xpath("//a[@class='_39g9']"));
		obj1.click();
	}else {
		System.out.println("Please enter valid Crednetials");
		
		}	
		driver.findElement(By.id("email")).sendKeys("8328624005");
		driver.findElement(By.id("pass")).sendKeys("Rajasekhar@297");
		WebElement enter1 = driver.findElement(By.name("login"));
		enter1.click();

	}*/

	}
}
