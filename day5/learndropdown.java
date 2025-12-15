package day5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class learndropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
	
		//SafariOptions options = new SafariOptions();
		
		
		driver.manage().window().maximize();
	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
     //WebDriverWait now = new WebDriverWait(driver, 10);
		
		//WebElement code = now.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
		//String ss=code.getText();
		//System.out.println("displayed text   =" + ss);
		
		
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		
		
		
		
		
	    //driver.findElement(By.id("form")).isDisplayed();
		
		/*driver.findElement(By.className("selected")).click();
		WebElement obj=driver.findElement(By.id("createOpportunityForm_opportunityStageId"));
		
	
		Select opt=  new Select(obj);
		opt.deselectByValue("SOSTG_QUOTED");
		
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("milir");
		driver.findElement(By.xpath(null))*/
		
		//driver.findElement(By.xpath("//li[@class='sectionTabButtonSelected']']")).click();
		//driver.findElement(By.xpath("//a[@class='selected']")).click();
		//driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TESTLEAF");
		//driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("software");
		//driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("tes.ting");
		
	//WebElement ele=driver.findElement(By.className("dataSourceId"));
	//Select opt= new Select(ele);
	//opt.selectByIndex(2);
	
	
		
	
		
		
		
		
	}

}
