package eCommerce;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Utility_ShoppingCartPage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")WebElement clickAddCartButton;
	
	public POM_Utility_ShoppingCartPage(WebDriver d) {
		
		driver=d;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
	}
	
	public void clickAddCart() {
		wait.until(ExpectedConditions.elementToBeClickable(clickAddCartButton)).click();
	    
	    try {
	        // Wait for the alert to appear
	        wait.until(ExpectedConditions.alertIsPresent());
	        
	        // Switch to the alert
	        Alert alert = driver.switchTo().alert();
	        
	        // Print alert message
	        System.out.println("\nAlert Message: " + alert.getText());
	        
	        // Accept the alert
	        alert.accept();
	        
	    } catch (Exception e) {
	        System.out.println("\nNo alert appeared: " + e.getMessage());
	}
	    driver.navigate().back();
	    driver.navigate().back();
}
}	
