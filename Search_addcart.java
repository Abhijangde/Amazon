package AMAZONE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_addcart{

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
		
		JavascriptExecutor aa =(JavascriptExecutor) driver;
		aa.executeScript("window.scrollBy(0,300)", "");

      //page switch
		String mainpage=driver.getWindowHandle();
		  System.out.println("mainpage="+mainpage);
		  WebElement shoes= driver.findElement(By.xpath("//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div[2]/div[2]/h2/a/span"));
		  shoes.click();
		  Thread.sleep(500);
		  
		 
		
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div[2]/div[2]/h2/a/span")).click();
		driver.get("https://www.amazon.in/Adidas-FTWWHT-Running-Shoes-10-CL7633_10/dp/B07M8RXP42/ref=sr_1_1?crid=3P2DNFFFDENAV&dib=eyJ2IjoiMSJ9.zlYmsDRKzfQNHtKHbx0OVqZCNulquD2G9NRtawj8KiomS4MC0mmJTHRdK-29kgm1nLT_1clFN04CIVM0i3eCeOReBVcBNEEYK0z9r42T7cyASGKSNhD9vxRtzXZWIqgnv-j6u9KwWQeM7QpK00lKDQw5DFZ9A26rZXStDXHTP9xUIwvmpiEkG5KyEMcpCXuNJtK1BjWfHy-1T3uf42sl9ub2VaQ6VmUc_meCOw5jH1a-QpBI8kb1sCm0x8VUpHAKhNg2BQ3dbcqJhk50x3s4J-yP7gDnLwluEPmKzsnLul0.Nq9_ZUt7AIuSxDUf-w0LIGVrivmO9AackVoPB1JO_E0&dib_tag=se&keywords=Shoes&qid=1718003578&refinements=p_123%3A198664&rnid=91049095031&s=shoes&sprefix=i+phone+14%2Caps%2C223&sr=1-1");
		
		JavascriptExecutor sa =(JavascriptExecutor) driver;
		sa.executeScript("window.scrollBy(0,400)", "");
		
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("sw-gtc")).click();
	}

		  }
