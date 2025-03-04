package eCommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Add_SecondProduct {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(linkText="Laptops")WebElement itemLaptop;
	@FindBy(linkText="Sony vaio i7")WebElement sonyLaptop;
	@FindBy(xpath = "//a[text()='Home']")WebElement homeLink;
	@FindBy(xpath = "/html/body/div[5]/div/div[2]/h2")WebElement sonyLaptopTitle;
	@FindBy(xpath= "/html/body/div[5]/div/div[2]/h3")WebElement sonyLaptoptPrice;
	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div[1]/div/div/p")WebElement sonyLaptoptDescription;
	
	public POM_Add_SecondProduct(WebDriver d) {
		
		driver=d;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void addLaptop() {
		
		//homeLink.click();
		wait.until(ExpectedConditions.elementToBeClickable(itemLaptop)).click();
	}
	public void selectSecondProduct(){
		wait.until(ExpectedConditions.elementToBeClickable(sonyLaptop)).click();
		
		System.out.println("\n!!!Product Details!!!");
		System.out.println("\nProduct sonyLaptop Title is: " + sonyLaptopTitle.getText());
		System.out.println("\nProduct sonyLaptop Price is: "+ sonyLaptoptPrice.getText());
		System.out.println("\nProduct sonyLaptop Description is: "+ sonyLaptoptDescription.getText());
		
		
		
	}
	
	
	
	

}
