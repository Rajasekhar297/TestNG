package TestNG;

public class PageClassEx {
	/*##Page Class --- 
	package com.framework.app.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.framework.function.core.FunctionLibrary;

	public class HomePage {
		
		// constructor
		public HomePage(WebDriver driver) { // constructor
			PageFactory.initElements(driver, this);
		}

	//Locators			
		// how to create a locator.

		@FindBy(name = "q") // locate google Search box.
		WebElement inputGooleSearch;
		
		@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[1]") // locate google search button
		WebElement buttonGoogleSearch;
		
		@FindBy(css = "[name='xyz']") // locate google Search box.
		WebElement textBoxUserName;
		
		@FindBy(xpath = "//*[name='xyzz']") // locate google Search box.
		WebElement textBoxPassword;

		@FindBy(xpath = "//gb_sb") // locate google Search box.
		WebElement linkGmail;

	// Functions ---specific to application.
		public void googleSearch(String keyword) {
			inputGooleSearch.sendKeys(keyword); //
			buttonGoogleSearch.click();
		}

		public void login(String userName, String password) {
			//enter user name 
			textBoxUserName.sendKeys(userName);
			textBoxPassword.sendKeys(password);
			buttonGoogleSearch.click();
			//password
		}
		
		public void clickOnGmailLink() {
			linkGmail.click();
		}

		/*
		 * //login public void Login(String userName, String Password) {
		 * textBoxSearch.sendKeys(userName); buttonSearch.click(); }
		 */
		/*
		 * public By searchbox = By.name("q"); public By searchButton = By.name("btnK");
		 */
		/*
		 * public void googleSearch(String keyword) {
		 * driver.findElement(searchbox).sendKeys(keyword);
		 * driver.findElement(searchButton).click(); }
		 */
	}





