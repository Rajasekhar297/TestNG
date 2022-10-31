package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sequnsing_Priority {

	@Test(priority=0)
	public void OpenBrowserandtypeFacebook() 
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Facebook");
		search.submit();
		driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();

	}
	@Test(priority=1)

	public void LoginFaceBook() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8328624005");
		driver.findElement(By.id("pass")).sendKeys("Rajasekhar@297");
		driver.findElement(By.name("login")).click();

	}

	@Test(priority=2)
	public void logout()
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8328624005");
		driver.findElement(By.id("pass")).sendKeys("Rajasekhar@297");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'])[7]")).click();
		driver.findElement(By.xpath("(//i[@class='x1b0d499 xep6ejk'])[5]")).click();

	}
}
