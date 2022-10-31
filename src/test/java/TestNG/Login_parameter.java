package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_parameter {
	String login = "Fails";
	
	
	@Test
	@Parameters({"Username","Password"})
	
public void login_paramaeter(String Username, String Password) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.name("username")).sendKeys(Username);
	driver.findElement(By.name("password")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	if(login.equals("Fails")) {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}else {
		System.out.println("Please Enter the Valid Credentials");
		
	}
		
		
		
	}
}
