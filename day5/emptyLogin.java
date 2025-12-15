package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class emptyLogin {

	public static void main(String[] args) {
	
		WebDriver driver= new SafariDriver();
		 
		 SafariOptions options = new SafariOptions();
			driver.manage().window().maximize();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//WebElement error=driver.findElement(By.xpath("//div[@id='errorDiv']"));
			//String show=error.getText();
			//System.out.println("error :: " + show);
		
			 WebDriverWait wait = new WebDriverWait(driver, 10);

		        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorDiv"))
		        );
		        String show=errorMsg.getText();
				System.out.println("error :: " + show);
		        
			
				 
			
			
			
			
			driver.quit();
			
		 
	
		
		
		
		
		
		
		
		
		

	}

}
