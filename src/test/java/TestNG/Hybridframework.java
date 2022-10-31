package TestNG;

public class Hybridframework {

	/* Hybrid framework with POM (page object modal design pattern) --Locators.


	structure  ---Happy Diwali. !!

	@Listeners (screenshot)
	||
	Pages (pack)> page classes (Ex: Homepage, SearchPage, CartPage, etc) + App spec
	||Object -----
	Lib> BaseTest (common functions)
	||extends (Inheritance -------------------------Java) 
	test/java -Modules (pack) > Test Scripts (Homepage homepage = new Homepage())
	||
	/resources 
	||
 	Excel 
 	Properties File (test data, config info --- cosntants)
 	Screenshot
   	---> screenshots. 

	Functions --
	1. commmon functions (base Class) ---- startBrowser, closeBrowser, handleAlert. etc
	2. Application specific functions (page classes) ---(ex- Login, search, etc)


    Framewok Integation
	--------------------
	---Project structure (packages + test script) +
   	Integration of Selenium + TestNG.XML + Maven(pom.xml) + GitHub + Jenkins.

	Methods ----

  	1. Method with NO args and no return type (Void) 
  	2. Method with args and no return type - void
  	3. Method without args and with return type - String, int, etc
  	4. Method with args and with return type - String, int
	 */




}
