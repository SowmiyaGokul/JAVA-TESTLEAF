package RunTestNG;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;




public class createLlead {
	//@Test(expectedExceptions={NoSuchElementException.class},description = "fiveclasses",priority=1) //set timer to check within 20sec run for 2 times) 
	
	//@Test(dependsOnMethods="RunTestNG.deleteLlead.fun") //calling another method from other class
	
	@Test(alwaysRun=true,enabled=false) //giving priority to enabled even thuogh its alwaysrun true
	
	
	public  void createlead() {	
		ChromeOptions options=new ChromeOptions();
options.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa "); // real failed case gave space at end and passed this test case using exception 2test
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//Assert.fail("Forcing failure for validation");  //throw error manaully
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	driver.findElement(By.name("submitButton")).click();
	driver.close();
	}
}