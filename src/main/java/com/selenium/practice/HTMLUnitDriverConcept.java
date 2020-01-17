package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("selenium-htmlunit-driver.driver","D:\\Documents\\My Details\\Materials\\Selenium\\Tools\\selenium-htmlunit-driver-2.9.0.driver.exe");
       // WebDriver driver = new HtmlUnitDriver();
        
        //HtmlUnit driver is not available in Selenium 3.x version
        //Htmlunit driver - to use this oncept we need to download the .jar file
        // Advantage:
        //1.Testing will happen behind the screen - no browser launch
        //2.Very fast : Execution of test cases - very fast -performance of script fast
        //3.Not suitable for action class - user actions -mousemovements ,double click, drag and drop
        //4.Ghost driver- HeadLess browser:
         // Html Unit driver -Java
        //PhantomJS -JavaScript
        
        
        
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html?e=1");
		System.out.println("Before login the Title is:" + driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("madhavaiqa");
		driver.findElement(By.name("password")).sendKeys("@Sairam123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("After login the Title is :" + driver.getTitle());
	}

}
