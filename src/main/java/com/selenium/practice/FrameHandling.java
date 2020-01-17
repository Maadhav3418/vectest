package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","D:\\Documents\\Softwares\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.findElement(By.name("username")).sendKeys("madhavaiqa");
		driver.findElement(By.name("password")).sendKeys("@Sairam123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

	}

}
