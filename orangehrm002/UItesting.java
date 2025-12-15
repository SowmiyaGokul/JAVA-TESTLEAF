package orangehrm002;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UItesting  {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
				
				SafariOptions options = new SafariOptions();
				
				
				driver.manage().window().maximize();
				WebDriverWait wait=new WebDriverWait(driver,20);
				
				
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		       
		        //to check logo
		      WebElement ele=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-branding']")));
		  boolean tf=ele.isDisplayed();
		  System.out.println("Logo displayed: " + tf);
		  
		  //to get position
		  WebElement position=driver.findElement(By.xpath(" //div[@class='orangehrm-login-branding']"));
		   	Point pt=position.getLocation();	
		   	int xaxis=pt.getX();
		   	int yaxis=pt.getY();	
		   	System.out.println("x side  = " + xaxis);
		   	System.out.println("y side  = " + yaxis);
		
		//username field and password is available
		   	
		   	WebElement ele1=driver.findElement(By.xpath("//input[@name='username']"));
		boolean tff=ele.isEnabled();
		System.out.println("is it visible "  +tff);
		
		
		   WebElement vis=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		   boolean yes=vis.isDisplayed();
		   System.out.print("mild text " + yes);
		   
		   
		   //get color
		   WebElement color=driver.findElement(By.xpath("//input[@name='username']"));
		   String ss=color.getCssValue("color");
		   System.out.println("color = "+ss);
		   
		   
		
	}}


