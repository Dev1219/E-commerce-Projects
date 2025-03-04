package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_SignupPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"signin2\"]")WebElement signUpTab;
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/button[2]")WebElement signUPButoon;
	@FindBy(id="sign-username")WebElement userName;
	@FindBy(id="sign-password")WebElement passWord;
	
	
	public POM_SignupPage(WebDriver d) {
		driver=d;
	PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignUpTab() {
		
		signUpTab.click();
	}
	
	public void setUsername(String un) {
		
		userName.clear();
		userName.sendKeys(un);
		
	}
	
	public void setPassword(String pw) {
		
		passWord.clear();
		passWord.sendKeys(pw);
	}
	
	public void clickOnsignUPButton() {
		
		signUPButoon.click();
		
	}

}
