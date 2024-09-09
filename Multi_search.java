package AMAZONE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "E:\\Java class\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 14");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.xpath("//*[@id=\"p_123/495128\"]/span/a/div/label/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"p_123/495128\"]/span/a/div/label/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"p_123/198664\"]/span/a/div/label/i")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
