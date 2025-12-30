package attributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseclass {
	RemoteWebDriver driver;
	
	@Test
	@Parameters({"url", "userName", "password","browser"})
	public void login(String url, String uName, String pWord, String browser) 
	{
		
		switch (browser) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
		case "Firefox":
			driver=new SafariDriver();
			break;
			default:
				System.err.println("no browser ");
			
			break;
		}
		
	/*ChromeOptions options=new ChromeOptions();
	options.addArguments("--guest");
		 driver = new ChromeDriver(options);*/
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.close();
	
	
	
	
	
}}


