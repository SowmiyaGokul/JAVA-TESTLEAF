package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class emptyPwd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new SafariDriver();
		 
		 SafariOptions options = new SafariOptions();
			driver.manage().window().maximize();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.className("decorativeSubmit")).click();
			Thread.sleep(5000);
			WebElement error=driver.findElement(By.xpath("//div[@class='serviceError']"));
			String show=error.getText();
			System.out.println("error :: " + show);
			
			WebElement ele=driver.findElement(By.xpath(" //div[@id='appDescr']"));
			String botom=ele.getText();
			System.out.println("displaying msg at bottom  = " + botom);
			//System.out.println(ConsoleColors.RED + "displaying msg at bottom  = " + botom);			
			
			
			
			
			
driver.quit()
;	}

}
