package orangehrm002;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangeLOGO {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new SafariDriver();
		
		SafariOptions options = new SafariOptions();
		
		
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
        //to get text in logo
      WebElement ele=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-branding']")));
   String str= ele.getText();
       System.out.println(str);
       
       WebElement position=driver.findElement(By.xpath(" //div[@class='orangehrm-login-branding']"));
   	Point pt=position.getLocation();	
   	int xaxis=pt.getX();
   	int yaxis=pt.getY();	
   	System.out.println("x side  = " + xaxis);
   	System.out.println("y side  = " + yaxis);
   	
       
       //sending username and pwd
   	Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    		   
       Thread.sleep(5000);
    		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        
          driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		
		
		
//driver.quit();
	}

}
