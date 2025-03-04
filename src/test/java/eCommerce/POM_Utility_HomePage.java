package eCommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Utility_HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(linkText="Phones")WebElement itemPhones;
	@FindBy(linkText="Laptops")WebElement itemLaptops;
	@FindBy(linkText="Monitors")WebElement itemMonitors;
	
	
	public POM_Utility_HomePage(WebDriver d) {
		
		driver=d;
	PageFactory.initElements(driver, this);	
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void viewPhones() {
		
		wait.until(ExpectedConditions.elementToBeClickable(itemPhones)).click();
	}
	
	public void viewLaptops() {
		
		wait.until(ExpectedConditions.elementToBeClickable(itemLaptops)).click();
	}
	
	public void viewMonitors() {
		
		wait.until(ExpectedConditions.elementToBeClickable(itemMonitors)).click();
	}
	
	
	

}
