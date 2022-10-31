package TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class ScreenshotEx {
	
	@Test
	
	public void screenshot() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://farescraper.com/");
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

		String currentdate = dateFormat.format(new Date());
		String actualdate =currentdate.replace(":", "_");
		System.out.println(actualdate);
		

		
		//Second Create a variable for the path location 
		
		String path = "C:\\Users\\rajna\\eclipse-workspace\\Practise_TestNG\\src\\test\\resources\\ScreenShorts";
		
		
		/*First thing we need to create an interface of "TakesScreenshot" for creating the method
		  of "getScreenshotAs(OutputType.File)" here we can call methods from the Interface.
		  this will assign one variable. Here File is called Class from java.
		   
		*/
		File scrFile =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Third step screen shot will store with another variable 
		
		File dstFile = new File(path + actualdate + ".jpg");
		
		FileUtils.copyFile(scrFile, dstFile);
		
		
		
	}

}
