package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class positionFindlogo {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new SafariDriver();
	
	SafariOptions options = new SafariOptions();
	
	
	driver.manage().window().maximize();

	driver.get("http://leaftaps.com/opentaps/control/main");
	Thread.sleep(5000);
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	Thread.sleep(5000);
	WebElement position=driver.findElement(By.xpath(" //div[@id='button']"));
	Point pt=position.getLocation();	
	int xaxis=pt.getX();
	int yaxis=pt.getY();	
	System.out.println("x side  = " + xaxis);
	System.out.println("y side  = " + yaxis);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.quit();
}
}
