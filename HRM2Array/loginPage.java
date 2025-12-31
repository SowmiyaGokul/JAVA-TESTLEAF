package HRM2Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;


public class loginPage  extends utils{

	
	@Test(dataProvider= "login",
	dataProviderClass=utils.class)
	

	public void login(String url,String uname, String pwd) throws InterruptedException {
	
               WebDriver driver = new SafariDriver();
                SafariOptions options = new SafariOptions();
                driver.manage().window().maximize();	
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(3000);

	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	    
	    		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	        
	          driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	          String tit=driver.getTitle();
		/*for (int i = 0; i < 5; i++) {
            driver.navigate().refresh();
            Thread.sleep(3000);
            if (!driver.getPageSource().contains("captcha")) {
                break;
            }
            
        }*/
	}
}
