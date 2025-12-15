package orangehrm002;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class negativeTestcases {


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new SafariDriver();
					
					SafariOptions options = new SafariOptions();
					
					
					driver.manage().window().maximize();
					WebDriverWait wait=new WebDriverWait(driver,30);
					
					
			        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			        
			    	Thread.sleep(5000);
			    	//empty credentials
			        
			        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			        
			        List<WebElement> errors=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
			                By.xpath("//span[text()='Required']")));
				

                   for (WebElement error : errors) {
                  System.out.println("ERROR MSG = " + error.getText());
                      }
			        
			
				
				
				
				
				
				
			        driver.quit();
			       
			        
			        
			        
			        

	}

}
