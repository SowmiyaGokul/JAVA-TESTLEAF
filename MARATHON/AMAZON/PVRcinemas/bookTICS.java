package PVRcinemas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bookTICS {

	public static void main(String[] args) throws InterruptedException {
		//MENTION
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//TO HANDLE BROWSER ARGUMENTS
		ChromeOptions options=new ChromeOptions();
		
		
		//WAIT PROCESS COMMENT
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		//LOADING URL
		driver.get("https://www.pvrcinemas.com/");
		
		//DIRECTLY PICKING CHENNAI
		WebElement elle = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//span[contains(@class,'kdusLc') and text()='Chennai']")
		        )
		);
		elle.click();
		
		//SELECT CINEMA
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		
		//SELECTING THEATRE
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
	    driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li//span[text()='PVR, Grand Mall, Velachery']")).click();
	    
	    //SELECT DATE
	    driver.findElement(By.xpath("//div[@id='date']")).click();
	    driver.findElement(By.xpath("//ul[@role='listbox']//li[2]")).click();
	    
	    //SELECT MOVIE NAME 
	    driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[1]")).click();
	    
	    //SELECT TIME 
	    driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[3]")).click();
	    
	   //BOOK
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	   //SUBMIT
	    driver.findElement(By.xpath("//button[text()='Accept']")).click();
	    
	    //SELECT SEATS
	    driver.findElement(By.xpath("//tr[@class='seats-row']//td//span[@id='CC.CLASSIC|A:11']")).click();
	    
	    //REGISTER
	    driver.findElement(By.xpath("̌//div[@class='register-btn']")).click();
	    
	    driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click(); // Closing the non model alert
		
		String title = driver.getTitle(); // Getting the title of the page
		System.out.println(title);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
