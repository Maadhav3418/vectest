package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vec.qa.util.TestUtil;

public class CustomXpath {

	public static void main(String[] args) throws Exception {
	
			System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get("https://www.audible.in");
			Thread.sleep(200);
			//absoulute path - not recommended
			//*[@id='']/div/div[2]/table/tbody/tr/td[2]/input
			//1.performance Issue
			//2.not reliable
			//3.can be changed at any time in future
			
		   // driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Clearblue");
		    //driver.findElement(By.xpath("//input[@name='']")).sendKeys("");
		   // driver.findElement(By.xpath("//input[contains(@class,'accessbox')]")).sendKeys("Help");
		    //dynamic id : input
		    //id =test_123
		    //By.id("test_123")
		    
		    //starts-with
		    //id =test_456
		    //id=test_789
		    //id=test_test_7890_test
		    
		    //ends with
		    //id=1234_test_t
		    //id=23456_test_t
		    //id=6789_test_t
		    //driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("ContactUs");
		   // driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("HelpLine");
		   // driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");
		    
		    //for Links custome path
		    //all the links are represented by <a> html tag
		    driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		    System.out.println("Contact Us clicked:");	
		   
		    Thread.sleep(200);
		    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Test");
		    
		   
		    System.out.println("Search Done:");
	}

}
