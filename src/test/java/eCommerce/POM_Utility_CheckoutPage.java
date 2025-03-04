package eCommerce;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Utility_CheckoutPage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(id="name")WebElement name;
	@FindBy(id="country")WebElement country;
	@FindBy(id="city")WebElement city;
	@FindBy(id="card")WebElement card;
	@FindBy(id="month")WebElement month;
	@FindBy(id="year")WebElement year;
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")WebElement purchaseButton;
	@FindBy(xpath="/html/body/div[10]")WebElement purchaseDescription;
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")WebElement confirmButton;
	

	
	public POM_Utility_CheckoutPage(WebDriver d) {
		
		driver =d;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
//	public void checkOut() {
//		
//		Set<String>window = driver.getWindowHandles();
//		//System.out.println(window);	
//		Iterator<String> itr = window.iterator();
//		
//		//String win1=itr.next();
//		String win2=itr.next();
//				
////		
////		System.out.println(win1);
////		System.out.println(win2);
//		
//		driver.switchTo().window(win2);
//		//System.out.println(driver.getTitle());
//		
		
	//}
	
	public void nameField(String un) {
		name.clear();
		name.sendKeys(un);
		
	}
	
	public void countryField(String cf) {
		country.clear();
		country.sendKeys(cf);
	}
	
	public void cityField(String ctf) {
		city.clear();
		city.sendKeys(ctf);
	}
	
	public void cardField(String crf) {
		card.clear();
		card.sendKeys(crf);
	}
	
	public void monthField(String mf) {
		month.clear();
		month.sendKeys(mf);
	}
	
	public void yearField(String yf) {
		year.clear();
		year.sendKeys(yf);
	}
	
	public void purchaseButtonClick() {
		purchaseButton.click();
	}
	
	public void purchaseMessage() {
		
		 wait.until(ExpectedConditions.visibilityOf(purchaseDescription));
		// Retrieve and print the message text
	        
		 System.out.println("Modal Message: " + purchaseDescription.getText());
		// System.out.println("Modal Message: " + purchaseMessage2);

	        // Click the 'OK' button to close the modal
		 confirmButton.click();

	        // Optionally, wait for the modal to disappear
	       // wait.until(ExpectedConditions.invisibilityOf(thankYouModal));
		
		
	}
	
	
}
