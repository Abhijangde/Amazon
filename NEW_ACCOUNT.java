package AMAZONE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NEW_ACCOUNT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "E:\\Java class\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")).click();
		//create new account
	/*	driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Abhinav jangde");
		driver.findElement(By.id("ap_phone_number")).sendKeys("7000632173");
		driver.findElement(By.id("ap_password")).sendKeys("Abhinav@1997");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();*/
		//SIGN IN


        // Find the email input field and enter the email address
        
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
        emailInput.sendKeys("bantijangde97@gmail.com");

        // Find the continue button and click it
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        continueButton.click();

       // Find the password input field and enter the password
        WebElement passwordInput = driver.findElement(By.id("ap_password"));
        passwordInput.sendKeys("Abhinav@3105");
      
        // Find the sign-in button and click it
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();
        
        Thread.sleep(2000);     
	}

}
