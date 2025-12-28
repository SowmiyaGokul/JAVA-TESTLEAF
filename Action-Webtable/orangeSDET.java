package sele001;

import java.awt.Window;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class orangeSDET {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new SafariDriver();
		driver.manage().window().maximize();
		
	  
	
	
		driver.get("https://www.flipkart.com/");
				
		//GETMETHODS-WINDOWHANDLES
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles();
		System.out.println(ids);
		
		List<String>wiids=new ArrayList<String>(ids);
		Thread.sleep(3000);
		
	//String one=wiids.get(0);
	Thread.sleep(3000);
	String two=wiids.get(1);
	Thread.sleep(3000);
	driver.switchTo().window(two);
	System.out.println(driver.getTitle());
		
		for(String ID: ids) {
		String title=driver.switchTo().window(ID).getTitle();
		if(title.equals(wiids)) {
			System.out.println(driver.getCurrentUrl());
		}
		
			
		}
		
		for(String win: ids ) {
			String title= driver.switchTo().window(win).getTitle();
			System.out.println(title);
			
			
			
		}
		
		
		for(String win: ids ) {
			
			String title=driver.switchTo().window(win).getTitle();
			if(title.equals(ids)) {
				System.out.println(title);
			}
		}*/
		
		//*************ACTIONS-MOUSEHOVER**************************8
		/*WebElement acc=driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("setTimeout(() => { debugger; }, 3000);");
		Actions act=new Actions(driver);
	    act.moveToElement(acc).build().perform();
		
	    //right click
		WebElement btn=driver.findElement(By.xpath("//div[contains(@class,'URRkKz') and contains(text(),'tv')]"))
;
		
		Actions act= new Actions(driver);
		act.contextClick(btn).perform();
		
		//DOUBLECLICK
		act.doubleclick(btn).perform();
		*/
		
	    
			
			
			
	
		
		
		
		
		
		
		
		
		
		
	}

}
