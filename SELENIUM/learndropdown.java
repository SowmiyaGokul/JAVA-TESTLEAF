package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class learndropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		//Thread.sleep(500);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		WebElement header = driver.findElement(By.tagName("h2"));

		
		String text = header.getText();
		System.out.println("text is: " + text);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		/*driver.findElement(By.className("selected")).click();
		WebElement obj=driver.findElement(By.id("createOpportunityForm_opportunityStageId"));
		
	
		Select opt=  new Select(obj);
		opt.deselectByValue("SOSTG_QUOTED");
		
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("milir");
		driver.findElement(By.xpath(null))*/
		
		driver.findElement(By.xpath("//li[@class='sectionTabButtonSelected']']")).click();
		driver.findElement(By.xpath("//a[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TESTLEAF");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("software");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("testing");
		
	WebElement ele=driver.findElement(By.className("dataSourceId"));
	Select opt= new Select(ele);
	opt.selectByIndex(2);
	
	
		
	
		
		
		
		
	}

}
