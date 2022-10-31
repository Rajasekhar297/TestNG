package TestNG;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	@Test

	public void gettext() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		// open Browser

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();

		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[1]")).click();
		WebElement object = driver.findElement(By.xpath("//a[@role='menuitem']"));
         
         
		assertTrue(object.isDisplayed());
		//assertFalse(object.isDisplayed());
		
		System.out.println(object.getText());

		
		
		
		//object.click();
		//System.out.println(object.isDisplayed());
		//System.out.println(object.getText());

		






	}















}
