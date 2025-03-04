package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Utility_LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"login2\"]")WebElement loginTab;
	@FindBy(id="loginusername")WebElement userName;
	@FindBy(id="loginpassword")WebElement passWord;
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")WebElement loginButton;
	
	public POM_Utility_LoginPage(WebDriver d) {
		
		driver=d;
	PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnLoginTab() {
		
		loginTab.click();
	}
	
	public void enterUsername(String us) {
		
		userName.clear();
		userName.sendKeys(us);
		
		
	}
	
	public void enterPassword(String ps) {
		passWord.clear();
		passWord.sendKeys(ps);
	}
	
	public void clickOnLoginButton() {
		
		loginButton.click();
		
		
	}
	
}
