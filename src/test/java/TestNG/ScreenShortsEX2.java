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

public class ScreenShortsEX2 {
	
	@Test
	
	public void screenshort() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.Amazon.com/");
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		// Date is from Java it is class and 
		 Date date = new Date();
		 
		SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
		
		String currentformat = dateformat.format(date);
		String actualformat = currentformat.replace(":","_");
		
		System.out.println(actualformat);
		
		
		
		String path = "C:\\Users\\rajna\\eclipse-workspace\\Practise_TestNG\\src\\test\\resources\\ScreenShorts";
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		File dstFile = new File(path + actualformat + ".jpg");
		
		FileUtils.copyFile(scrFile,dstFile);
		
	    
	
	}

}
