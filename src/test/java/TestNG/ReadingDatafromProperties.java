package TestNG;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDatafromProperties {
	
	@Test
	
	public void readingdaaofProperties() throws Exception{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.get("https://www.flipkart.com/");
		/* In the Properties concept rather than writing the hardcoding the data of geturl 
		   we will use the "Properties" as a class from Java and we will create the New file
		   (NotePad) in that we will write the data multiple and that data we will copy 
		   the path and add in the program same as like Excel.
		*/ 
		// Now using the Properties as Class from java. 
		
		Properties prop = new Properties();
		
		// Specifying the path from the resource
		
		String path = "C:\\Users\\rajna\\eclipse-workspace\\Practise_TestNG\\src\\test\\resources\\Constants.properties";
		
		// Now after specifying the path call the path Using the FileInputStream of Class from Java
	
		FileInputStream file = new FileInputStream(path);
		
		// now after calling the the path to another new name Object now load the file 
		// Use "Load" is method from java, to load the file 
		
		prop.load(file);
		
		//get the Url from the Note pad or Properties.
		
		String url = prop.getProperty("appURL");
		
		System.out.println(url);
		
		driver.get(url);
		
		
		
		
		
		String path1 = "C:\\Users\\rajna\\eclipse-workspace\\Practise_TestNG\\src\\test\\resources\\Excel-SS_Amazon.xlsx";
		
		FileInputStream  file2= new FileInputStream(path1);
		
		Workbook wb = WorkbookFactory.create(file2);
		
		Sheet items = wb.getSheet("Products");
		
		int rowCount = items.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) {
			
			String products = items.getRow(i).getCell(0).getStringCellValue();
			
			driver.findElement(By.name("q")).clear();
			driver.findElement(By.name("q")).sendKeys(products);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
