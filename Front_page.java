package AMAZONE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Front_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "E:\\Java class\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		//check mouse actions
		WebElement Language=driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span"));
		WebElement signin=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions act=new Actions(driver);
		act.moveToElement(Language).perform();
		Thread.sleep(2000);
		act.moveToElement(signin).perform();
		Thread.sleep(1000);
		WebElement order= driver.findElement(By.xpath("//*[@id=\"nav-orders\"]"));
		act.moveToElement(order).perform();
		
		//slider button
		
		driver.findElement(By.xpath("//*[@id=\"gw-desktop-herotator\"]/div/div/div/div[3]/a/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gw-desktop-herotator\"]/div/div/div/div[3]/a/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gw-desktop-herotator\"]/div/div/div/div[3]/a/i")).click();
		Thread.sleep(1000);
		
		//scroll down
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");
		
		Thread.sleep(1000);
		
		// scroll up
		JavascriptExecutor as = (JavascriptExecutor) driver;
		as.executeScript("window.scrollTo(0,-700)", "");
		
		Thread.sleep(1000);
		
		//LANGUAGE CHANGE
	   driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]")).click();
	  
	   driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i")).click();
	   driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input")).click();
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[2]/div/label/i")).click();
	   driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input")).click();
	   
	   
	   Thread.sleep(2000);
	   
	   
	   //change country
	   driver.get("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fcustomer-preferences%2Fcountry%3Fref_%3Dicp_lop_mop_chg%26preferencesReturnUrl%3D%2F&ref_=topnav_lang");
       driver.findElement(By.xpath("//*[@id=\"icp-touch-link-country\"]")).click();
	  
	   

	   
	  // driver.close();
	}

}
