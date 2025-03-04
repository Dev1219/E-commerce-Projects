package eCommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Utility_ProductDetailPage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(linkText="Phones")WebElement itemPhone;
	@FindBy(linkText="Iphone 6 32gb")WebElement product;
	@FindBy(css=".name")WebElement productTitle;
	@FindBy(css=".price-container")WebElement productPrice;
	@FindBy(css="#more-information")WebElement productDescription;
	
	public POM_Utility_ProductDetailPage(WebDriver d) {
		 driver= d;
	PageFactory.initElements(driver, this);
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	}
	
	public void clickPhones() {
		
		wait.until(ExpectedConditions.elementToBeClickable(itemPhone)).click();
	}
	
	public void selectProduct() {
		
		wait.until(ExpectedConditions.elementToBeClickable(product)).click();
		
		System.out.println("\n!!!Product Details!!!");
		System.out.println("\nProduct Iphone 6 Title is: " + productTitle.getText());
		System.out.println("\nProduct Iphone 6 Price is: "+ productPrice.getText());
		System.out.println("\nProduct Iphone 6 Description is: "+productDescription.getText());
		
	}

}
