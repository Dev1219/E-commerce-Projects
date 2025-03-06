package eCommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Utility_Logout {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(id="logout2")WebElement logOutLink;
	
	public POM_Utility_Logout(WebDriver d) {
		driver = d;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

public void clickOnLogOut() {
	
	wait.until(ExpectedConditions.elementToBeClickable(logOutLink)).click();
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
	
}
