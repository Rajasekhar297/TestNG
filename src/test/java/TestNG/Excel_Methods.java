package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Methods {
	@Test
	
	public void excel_methods() throws Exception {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		// open Browser
        driver.get("https://opensource-demo.orangehrmlive.com/");

        /*To Read the Data from the Excel 
         * First thing after the Login Website we need to read the data from the Excel
         * Create a variable for the Location of Excel using String
         */
        
        String location = "C:\\Users\\rajna\\eclipse-workspace\\Practise_TestNG\\src\\test\\resources\\Excel-SS.xlsx";
          
        //Now by using  java (FileInputStream) assign an Object or Variable for storing the EXCEL file 
        
        FileInputStream file = new FileInputStream(location);
        
        //Before we have been find the Excel and specified one variable and created the for the name separately by using API method
        // Now by Workbook as a Class for an Excel and also we will create Object for that Excel 
        // Here saving Excel as a Workbook using SS  Model API (apache api)
        
        Workbook notes = WorkbookFactory.create(file); 
        
        //Using the Sheet as a Class  we need to read the data from the Workbook 
        
        Sheet loginData = notes.getSheet("LoginData");
        
        // Sheet wise data identified and need to specify the location of the data by using the methods
        //getRow().getCell().getStringCell()
        
        String username = loginData.getRow(1).getCell(0).getStringCellValue();
        String password = loginData.getRow(1).getCell(1).getStringCellValue();
     
        driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// To Verification 
		
		String expected = "Abdullah Noman";
		String actual = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		
		assertEquals(actual, expected);
		WebElement obj = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		
		 assertTrue(obj.isDisplayed());
		
		System.out.println(obj.getText());
		
		
		
		
	}

}
