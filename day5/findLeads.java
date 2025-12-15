package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findLeads {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		
		//SafariOptions options = new SafariOptions();
		
		
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Phone")));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
	     WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'CRM')]")));
         ele.click();
         
         WebElement leads = wait.until(
        	        ExpectedConditions.visibilityOfElementLocated(By.linkText("Leads")));
         leads.click();
		
		WebElement ny=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Find Leads")));
		ny.click();
		
		 WebElement ph= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Phone")));
         ph.click();
		
		
		
		WebElement code= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][@name='phoneAreaCode']")));
        code.sendKeys("3455");
		
		
		WebElement no=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][@name='phoneNumber']")));
		no.sendKeys("4783264781");
		
	
		WebElement found = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//button[text()='Find Leads']")
		        )
		);
		found.click();
		
		
	
		
	driver.quit();
	}

}
