package TestNG;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivernTest {
	
	@Test
	 
	public void datadriverntest()throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/login/");
	
	String path = "C:\\Users\\rajna\\eclipse-workspace\\Practise_TestNG\\src\\test\\resources\\Excel-SS_Facebook.xlsx";
	
	FileInputStream file = new FileInputStream(path);
	
	Workbook wb = WorkbookFactory.create(file);
	
	Sheet sheetLogin = wb.getSheet("loginfacebook");
	
	
	int countRow = sheetLogin.getLastRowNum();
    //Row row = sheetLogin.getRow(0);
	//int colNum = row.getLastCellNum();	
	
	 for(int i=1;i<=countRow;i++) {
		 
		 
		 Row row = sheetLogin.getRow(i);
		
		 int cellCount = row.getLastCellNum();
		 
		 //String uName = sheetLogin.getRow(i).getCell;
		 
		 
		 {
			 for(int j=0; j<=cellCount; j++) {
				 
				 //String pwd = sheetLogin.getCell(j).getStringCellValue();
				 
				// String uName = sheetLogin.getRow(i).getCell(j).getStringCellValue();
				 
				 //String pwd = sheetLogin.getRow(i).getCell(j++).getStringCellValue();
				 
				 driver.findElement(By.id("email")).sendKeys();
				 driver.findElement(By.id("pass")).sendKeys();
				 driver.findElement(By.id("loginbutton")).click();
				 
				 
			 }
		 }
		
	 }
	
		
	}

}
