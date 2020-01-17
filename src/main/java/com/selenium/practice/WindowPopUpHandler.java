package com.selenium.practice;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandler {

	public static void main(String[] args) throws Exception {
		
		//1. Alerts - JavaScript Popup -Alert API(accept,dismiss) 
		//2.FileUpload popup - Browser button (type -file,sendKeys(path))
		//3.Browser Window Popup- Advertisement popup (windowHandler API-getWindowHandles());
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(200);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId =it.next();
		System.out.println("Parent Window is :" + parentWindowId);
		
		String childWindowID =it.next();
		Thread.sleep(200);
		System.out.println("Child Window is :" + childWindowID );
		driver.switchTo().window(childWindowID);
		System.out.println("Child Window Title is :" + driver.getTitle());
		driver.manage().window().maximize();
		System.out.println("Child Window URL is :" + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(200);
		System.out.println("parentWindowId Title is :" + driver.getTitle());
		System.out.println("parent Window URL is :" + driver.getCurrentUrl());
	}

}
