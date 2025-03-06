package eCommerce;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class POM_Utility_Screenshot {
	
	public static void captureScreenshot(WebDriver driver, String fname) {
		 try {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File temp = ts.getScreenshotAs(OutputType.FILE);

	            // Ensure Screenshot folder exists
	            File screenshotDir = new File(System.getProperty("user.dir") + "//Screenshot//");
	            if (!screenshotDir.exists()) {
	                screenshotDir.mkdirs();
	            }

	            File dest = new File(screenshotDir, fname + System.currentTimeMillis() + ".png");
	            FileUtils.copyFile(temp, dest);
	            System.out.println("\nScreenshot saved: " + dest);
	        } catch (IOException e) {
	            System.out.println("\nFailed to capture screenshot! Error: " + e.getMessage());
	        }

}

}
