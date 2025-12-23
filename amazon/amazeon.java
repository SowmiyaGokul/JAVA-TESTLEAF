package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazeon {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new SafariDriver();
		
		SafariOptions options = new SafariOptions();
		
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag for boys");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement el=driver.findElement(By.xpath("//span[contains(text(),'10,000 results for')]"));
		String result=el.getText();
		System.out.println(result);
		
		//SELECT ONE BAG
		/*driver.findElement(By.linkText("https://m.media-amazon.com/images/I/41f0TWElfZL._AC_UL640_FMwebp_QL65_.jpg")).click();
		Thread.sleep(5000);
		//PRINT ALL
		List<WebElement> elee=driver.findElements(By.xpath("//h2//span"));
		for(WebElement eee: elee) {
			String n=eee.getText();
			if (!n.isEmpty()) {
		        System.out.println(n);
			
			
		}
		}*/
		}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
