package quiz;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class codingQuiz {

	public static void main(String[] args) {
		
		// Launch the safari browser using safariDriver.
		WebDriver driver=new SafariDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// Apply an implicit wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//navigate url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//send user name and password 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
	
		
		/* driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.facebook.com/");
		String urll=driver.getCurrentUrl();
		System.out.println(urll);
		*/
		   
		

	}


