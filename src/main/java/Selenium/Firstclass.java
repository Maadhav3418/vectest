package Selenium;

import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Firstclass {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver(); 
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("_3Njdz7")).click();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.className("_2aUbKa"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(ele).click().perform();
		
		driver.findElement(By.xpath("//div[@class='_1jcwFN _3dmQRh']")).click();
		//*[@id="container"]/div/div[1]/div[1]/div[2]/div[4]/div/div
		Thread.sleep(2000);
		//driver.close();
	}

}
