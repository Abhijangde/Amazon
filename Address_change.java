package AMAZONE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Address_change {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "E:\\Java class\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		//find the address field and change address
		
		driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]")).click();
		
		//enter address pin code
		WebElement Address= driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]"));
		Address.sendKeys("481115");
		//apply button check
		driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).click();
		
		Thread.sleep(2000);
	}

}
