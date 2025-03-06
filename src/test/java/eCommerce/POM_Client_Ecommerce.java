package eCommerce;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class POM_Client_Ecommerce {
	
	WebDriver driver;
	POM_SignupPage signupPage;
	POM_Utility_LoginPage loginPage;
	POM_Utility_HomePage homePage;
	POM_Utility_ProductDetailPage productPage;
	POM_Utility_ShoppingCartPage cartPage;
	POM_Add_SecondProduct laptopPage;
	POM_Utility_CartPage cartPageOptn;
	POM_Utility_CheckoutPage chekoutPage;
	
	ExtentReports extent;
    ExtentSparkReporter sparkReporter;
    ExtentTest test;
	
	
  @Test (priority=1)
  public void signUp() throws InterruptedException {
	  
	  System.out.println("\n Test For SignUP Page: ");
	  test = extent.createTest("signUp Test");
    try {
	  signupPage.clickOnSignUpTab();
	  Thread.sleep(5000);
	  signupPage.setUsername("devendra1231813456");
	  signupPage.setPassword("testing1231813456");
	  Thread.sleep(3000);
	  POM_Utility_Screenshot.captureScreenshot(driver, "SignUP");
	  signupPage.clickOnsignUPButton();
	  Thread.sleep(5000);
    	test.pass("SignUp completed successfully");
    } catch (Exception e) {
        test.fail("SignUp failed: " + e.getMessage());
        
    }
    
      Thread.sleep(5000);	
	  Alert alt;
	  alt= driver.switchTo().alert();
	  System.out.println(alt.getText());
	  alt.accept();
	  
	  
  }
 
  @Test (priority=2)
  public void logIn() {
	  
	  System.out.println("\nTest For Login Page: ");
	  test = extent.createTest("logIn Test");
      try {
	  loginPage.clickOnLoginTab();
	  loginPage.enterUsername("devendra1231813456");
	  loginPage.enterPassword("testing1231813456");
	  loginPage.clickOnLoginButton();
	  POM_Utility_Screenshot.captureScreenshot(driver, "Login");
	  test.pass("Login completed successfully");
      } catch (Exception e) {
          test.fail("Login failed: " + e.getMessage());
      }

  }
  
  @Test (priority=3)
  public void browsingProduct() throws InterruptedException {
	  
	  System.out.println("\nTest For Product Page: ");
	  test = extent.createTest("browsingProduct Test");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	    for (int i = 0; i < 2; i++) { // RETRY MECHANISM
	        try {
	            homePage.viewPhones();
	            js.executeScript("window.scrollBy(0,600)", "");
	            Thread.sleep(3000);
	            POM_Utility_Screenshot.captureScreenshot(driver, "Phones");
	            test.pass("Browsed Phones category successfully");
	            System.out.println("\nBrowsed Phones category successfully");
	            Thread.sleep(3000);

	            homePage.viewLaptops();
	            js.executeScript("window.scrollBy(0,400)", "");
	            Thread.sleep(3000);
	            POM_Utility_Screenshot.captureScreenshot(driver, "Laptops");
	            test.pass("Browsed Laptops category successfully");
	            System.out.println("\nBrowsed Laptops category successfully");
	            Thread.sleep(3000);

	            homePage.viewMonitors();
	            js.executeScript("window.scrollBy(0,400)", "");
	            Thread.sleep(3000);
	            POM_Utility_Screenshot.captureScreenshot(driver, "Monitors");
	            test.pass("Browsed Monitors category successfully");
	            System.out.println("\nBrowsed Monitors category successfully");
	            Thread.sleep(3000);
	            break; // SUCCESSFUL EXECUTION, EXIT LOOP
	        } catch (org.openqa.selenium.StaleElementReferenceException e) {
	            System.out.println("Retrying due to stale element: " + e.getMessage());
	        } catch (Exception e) {
	            test.fail("Error browsing products: " + e.getMessage());
	            break; // Exit on a non-recoverable error
	        }
	    }
	  
	  
  }
  
  @Test (priority=4)
  
  public void clickOnProduct() throws InterruptedException {
	  
	  System.out.println("\nTest For Add Product Page: ");
	  
	  test = extent.createTest("clickOnProduct Test");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	    for (int i = 0; i < 2; i++) { // RETRY MECHANISM
	        try {
	            productPage.clickPhones();
	            js.executeScript("window.scrollBy(0,400)", "");
	            Thread.sleep(3000);

	            productPage.selectProduct();
	            Thread.sleep(3000);
	            POM_Utility_Screenshot.captureScreenshot(driver, "AddPhone");
	            test.pass("Product clicked and added to cart");
	    
	            Thread.sleep(3000);
	            
	            
	            break; // SUCCESSFUL EXECUTION, EXIT LOOP
	        } catch (org.openqa.selenium.StaleElementReferenceException e) {
	            System.out.println("Retrying due to stale element: " + e.getMessage());
	        }catch (Exception e) {
	            test.fail("Error clicking product: " + e.getMessage());
	        }
	    }
	  
	  
	  
  }
  
  @Test (priority=5)
  
  public void addToCart() throws InterruptedException {
	  
	  System.out.println("Test For Add Cart Page: ");
	  test = extent.createTest("addToCart Test");
	  try {
	  cartPage.clickAddCart();
	  test.pass("Product added to cart successfully");
	  System.out.println("\nProduct Phone clicked and added to cart SuccessFully");
      
      } catch (Exception e) {
          test.fail("Error adding product to cart: " + e.getMessage());
      }
	  
  }
  
  @Test (priority=6)
  
  public void selectLaptop() throws InterruptedException {
	  
	  System.out.println("Add Laptop Page");
	  test = extent.createTest("selectLaptop Test");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	    for (int i = 0; i < 2; i++) { // RETRY MECHANISM
	        try {
	            laptopPage.addLaptop();
	            js.executeScript("window.scrollBy(0,400)", "");
	            Thread.sleep(3000);
	            laptopPage.selectSecondProduct();
		          
	            Thread.sleep(3000);
	            POM_Utility_Screenshot.captureScreenshot(driver, "AddLaptop");
	           
	            Thread.sleep(3000);
	            
	            cartPage.clickAddCart();
	            test.pass("Laptop added to cart successfully");
	            System.out.println("\nProduct Laptop clicked and added to cart SuccessFully");
		          
   
	            break; // SUCCESSFUL EXECUTION, EXIT LOOP
	        } catch (org.openqa.selenium.StaleElementReferenceException e) {
	            System.out.println("Retrying due to stale element: " + e.getMessage());
	        } catch (Exception e) {
	            test.fail("Error selecting laptop: " + e.getMessage());
	            break; // Exit on a non-recoverable error
	        }    
	    }
	    
	    
  }
  
  @Test (priority=7)
  public void cartPageOpn() throws InterruptedException {
	  
	  System.out.println("\nTest For Cart Page: ");
	  test = extent.createTest("cartPageOpn Test");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	    for (int i = 0; i < 2; i++) { // RETRY MECHANISM
	        try {
	            js.executeScript("window.scrollBy(0,-400)", "");
	            Thread.sleep(3000);

	            cartPageOptn.cartPageOption(); 
	            test.pass("Cart page opened successfully");
	          
	            Thread.sleep(3000);
	            
	            
	            break; // SUCCESSFUL EXECUTION, EXIT LOOP
	        } catch (org.openqa.selenium.StaleElementReferenceException e) {
	            System.out.println("Retrying due to stale element: " + e.getMessage());
	        } catch (Exception e) {
	            test.fail("Error opening cart page: " + e.getMessage());
	        }
  }
  }  
  
  @Test (priority=8)
  
  public void checkOutProcess() throws InterruptedException {
	  
	  System.out.println("\nTest For CheckOut Page: ");
	  test = extent.createTest("checkOutProcess Test");
	  try {
	  //chekoutPage.checkOut();
	  Thread.sleep(5000);
	  chekoutPage.nameField("Devendra");
	  chekoutPage.countryField("India");
	  chekoutPage.cityField("Mandsaur");
	  chekoutPage.cardField("123456");
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,400)", "");
	  chekoutPage.monthField("March");
	  chekoutPage.yearField("2025");
	  POM_Utility_Screenshot.captureScreenshot(driver, "Purchase");
	  chekoutPage.purchaseButtonClick();
	  Thread.sleep(10000);
	  POM_Utility_Screenshot.captureScreenshot(driver, "PurchaseMessage");
	  chekoutPage.purchaseMessage();
	  Thread.sleep(5000);
	  test.pass("Checkout process completed successfully");
      } catch (Exception e) {
          test.fail("Checkout process failed: " + e.getMessage());
      }
  }
  
  
  
  
  
  
  
@BeforeTest
  public void beforeTest() {
	
	// Initialize the ExtentReports and ExtentSparkReporter
     sparkReporter = new ExtentSparkReporter("ExtentReport.html");
     extent = new ExtentReports();
     extent.attachReporter(sparkReporter);
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.demoblaze.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  signupPage= new POM_SignupPage(driver);
	  loginPage= new POM_Utility_LoginPage(driver);
	  homePage= new POM_Utility_HomePage(driver);
	  productPage= new POM_Utility_ProductDetailPage(driver);
	  cartPage= new POM_Utility_ShoppingCartPage(driver);
	  laptopPage = new POM_Add_SecondProduct(driver);
	  cartPageOptn= new POM_Utility_CartPage(driver);
	  chekoutPage= new POM_Utility_CheckoutPage(driver);
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
	  driver.quit();
  }

}
