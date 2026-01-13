package HRM2Array;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tatacliq {

	public static void main(String[] args) throws InterruptedException {

		// driver initailize
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		driver.get("https://www.tatacliq.com/");

		// mouseover to action class
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[@role='button' and contains(text(),'Brands')]"));
		act.moveToElement(ele).perform();

		WebElement ell = driver.findElement(By.xpath("//div[contains(text(),'Watches & Accessories')]"));
		act.moveToElement(ell).click().perform();

		driver.findElement(By.xpath("//div[contains(text(),'Casio')]")).click();
		Thread.sleep(5000);
		WebElement choices = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		// select class for selecting option in dropdown
		Select choose = new Select(choices);
		choose.selectByVisibleText("New Arrivals");
		Thread.sleep(3000);
		// radio button
		WebElement radio = driver
				.findElement(By.xpath("//div[@class='FilterDesktop__newFilName' and (contains(text()," + "'men'))]"));

		String btn = radio.getText();
		radio.click();
		System.out.println("Selected option  :" + btn);

		// print all price of watches - list(0) = this mrp
		Thread.sleep(3000);
		List<WebElement> LE = driver
				.findElements(By.xpath("//div[contains(@class,'ProductDescription__priceHolder')]"));
		System.out.println("MRP OF EACH ITEMS  " + LE.size());

		for (WebElement value : LE) {

			System.out.println("list values are   : " + value.getText());
		}
		// click on the first resulting watch
		WebElement firstitem = driver.findElement(By.xpath("//div[@class='PlpComponent__base'][1]"));
		String first = firstitem.getText();
		firstitem.click(); // javascript executor
		System.out.println("selected first option :" + first);

		// find hightest and lower prices
		List<Integer> priceList = new ArrayList<>();

		for (WebElement price : LE) {
			priceList.add(Integer.parseInt(price.getText().replaceAll("[^0-9]", "")));
		}

		Collections.sort(priceList);

		System.out.println("Lowest price: ₹" + priceList.get(0));
		System.out.println("Highest price: ₹" + priceList.get(priceList.size() - 1));

		// check how prices are unique or duplicates

		List<Integer> doop = new ArrayList<>();

		for (WebElement doopPrice : LE) {
			priceList.add(Integer.parseInt(doopPrice.getText().replaceAll("[^0-9]", "")));
		}

		if (doop.size() > LE.size()) {
			System.out.println("doops existing");

		} else {
			System.out.println("all  prices unique");
		}

		// find similar prices
		Map<Integer, Integer> priceCount = new HashMap<>();

		for (WebElement price : LE) {
			int value = Integer.parseInt(price.getText().replaceAll("[^0-9]", ""));
			priceCount.put(value, priceCount.getOrDefault(value, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : priceCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate price ₹" + entry.getKey() + " appears " + entry.getValue() + " times");
			}
		}

		// click Add to cart and get count from the cart icon.
		// selenium opens new window after clicking on item
		driver.findElement(By.xpath("//div[@class='Grid__element' and contains(.,'Casio A251')]")).click();
		// WebDriver window=driver.switchTo().window(first);

		Set<String> parent = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(parent);

		driver.switchTo().window(windows.get(0));
		String title = driver.getTitle();
		System.out.println("parent window title is  : " + title);

		driver.switchTo().window(windows.get(0));
		String tit = driver.getTitle();
		System.out.println("child window title is  : " + tit);

		// using javascript instead of action
		WebElement cart = driver.findElement(By.xpath("//*[text()='ADD TO BAG']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", cart);
		js.executeScript("arguments[0].click();", cart);

		WebElement er = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'Toast')]")));
		String notif = er.getText();
		System.out.println("displayed information  : " + notif);

		 
		WebElement check=driver.findElement(By.xpath(("//*[text()='GO TO BAG']")));
		String str=check.getText();
		System.out.println("Button changed to  : "+ str);

		
		//click cart button--> no need to click cart 
		WebElement count=driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		String cc=count.getText();
	    int ex=Integer.parseInt(cc);
	    System.out.println("No of items in cart  : "+ ex);
		
	    //closing opened windows one by one 
	    Set<String> close=driver.getWindowHandles();
	   

	    for (String window : close) {
	        driver.switchTo().window(window);
	        driver.close();   // closes current window
	    }
	    
	    
	    
		
		
	}

}
