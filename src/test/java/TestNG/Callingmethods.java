package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.framework.app.pages.HomePage;
import com.framework.function.core.BaseTest;
import com.framework.function.core.FunctionLibrary;

public class Callingmethods extends BaseTest{

	
	/*first we need to extends the BaseTest here we can call methods directly 
	 * next write the main method name we are using TESTNG and syntax of "public void classname()"
	 * next incase any othermethods need to call from another class we will be creating
	 * an object of that class in the starting itself. at global level we will be declaring the WebDriver driver;
	 * next we can call methods directly by method name
	 * when calling the methods from one class to another class we need to specify the obj.methodname
	 * 
	 */
	
	@Test
	public void opengoogle() {
		
		//
		HomePage page = new HomePage(driver);
		FunctionLibrary lib = new FunctionLibrary();
		
		// directly calling from the BaseTest because itself is Common functions
		startBrowser("chrome");
		// directly calling from the BaseTest because itself is Common functions
		waitForElementIsPresent(10);
		// directly calling from the BaseTest because itself is Common functions
		openApplication("https://www.google.com/");
		// Here it is not a common function it is APPLICATION Function so 
		// we are created one obj for the class 
//		driver.findElement(By.name("q")).sendKeys("selenium");
//		driver.findElement(By.name("btnK")).click();
		
	//	page.googleSearch("Selenium");
		//lib.verifyPageTitle("Online Shopping For men");









		//	public static void main(String[] args) {
		//		
		//	
		//	
		//	WebDriverManager.chromedriver().setup();
		//	WebDriver driver = new ChromeDriver();
		//	
		//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//	
		//	driver.get("https://www.google.co.in/");
		//	
		//	driver.findElement(By.name("q")).sendKeys("Selenium");
		//	driver.findElement(By.name("btnK")).click();
		//	
		//	String expectedTitle = "Selenium - Google Search";
		//	String actualTitle = driver.getTitle();
		//	
		//	if(actualTitle.contains(expectedTitle)) {
		//		
		//		System.out.println("pass");
		//	}else {
		//		System.out.println("Fail");
		//	}

	}







}
