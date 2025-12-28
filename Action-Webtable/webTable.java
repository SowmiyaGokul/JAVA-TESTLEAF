package sele001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new SafariDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/table.xhtml");
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	  
	   WebElement elText=driver.findElement(
	    	    By.xpath("//*[text()='Customer Analytics Table']//tr"));
		
	/*List<WebElement> Lit=elText.findElements(By.xpath("//tr[@role='row']"));
	   
	    List<WebElement> lit =
	    		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
	    		    By.cssSelector("tbody tr td")
	    		));
	    int i=lit.size();
	    System.out.println(i);
	  Thread.sleep(3000);
	for(WebElement web: lit) {
		String str= web.getText();
		System.out.println("list of : " + str);
	}
		*/
	
	    Actions act=new Actions(driver);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", act);
		System.out.println("Scrolled to bottom   " + act.getClass());
		
	    
	    
	

	}

}
