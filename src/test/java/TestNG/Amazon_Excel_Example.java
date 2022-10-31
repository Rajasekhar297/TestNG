package TestNG;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Excel_Example {

	@Test

	public void amazon_excel_example() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		// open Browser
		driver.get("https://www.amazon.in/");

		// Now add Excel to read the Data.

		String excelfile = "C:\\Users\\rajna\\eclipse-workspace\\Practise_TestNG\\src\\test\\resources\\Excel-SS_Amazon.xlsx";

		// call this varible by using  the object using the Method of FileInputStream

		FileInputStream  mainfile = new FileInputStream(excelfile);

		// Now Convert this Excel file into the Workbook using SS  Model API (apache api)

		Workbook wb = WorkbookFactory.create(mainfile);

		// we need to read the data from the Workbook 

		Sheet items = wb.getSheet("Products");

		
		//get all rows in the sheet
        //int countRow=items.getLastRowNum()-items.getFirstRowNum();
		//count 
		int countRow = items.getLastRowNum();
		
		//using for loop for repeating purpose
		
		for(int i = 1;i <=countRow;i++) {

			String pb1 = items.getRow(i).getCell(0).getStringCellValue();

			driver.findElement(By.name("field-keywords")).clear();
			driver.findElement(By.name("field-keywords")).sendKeys(pb1);
			driver.findElement(By.id("nav-search-submit-button")).click();



		}




		// Now Sheet wise data identified 

		/* String pb1 = items.getRow(1).getCell(0).getStringCellValue();
		  String pb2 = items.getRow(2).getCell(0).getStringCellValue();
		  String pb3 = items.getRow(3).getCell(0).getStringCellValue();
		  String pb4 = items.getRow(4).getCell(0).getStringCellValue();
		  String pb5 = items.getRow(5).getCell(0).getStringCellValue();

		  // identify the Element 
		  driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys(pb1);
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys(pb2);
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys(pb3);
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys(pb4);
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.name("field-keywords")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys(pb5);
		driver.findElement(By.id("nav-search-submit-button")).click();
		 */


	}






}
