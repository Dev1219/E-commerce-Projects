package eCommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Utility_CartPage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//a[contains(text(), 'Cart')]")WebElement cartLink;
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")WebElement placeOrderButton;
	
	public POM_Utility_CartPage(WebDriver d) {
		
		driver=d;
	PageFactory.initElements(driver, this);	
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
	}
	
	public void cartPageOption() {
		
		wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
	
		
		
	}

}
