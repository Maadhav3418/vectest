package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vec.qa.util.TestUtil;

public class FindElementsConcepts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get("https://www.audible.in");
		
		//1.Get Total Number of links on the page
		//2.Get the text of each link on the page
		
		Thread.sleep(200);
		List <WebElement> li = driver.findElements(By.tagName("a"));
		Thread.sleep(300);
		System.out.println("Total Number of Links: " + li.size());
	
		for(int i=0;i<li.size();i++)
		{
			String lt=li.get(i).getText();
			Thread.sleep(300);
			System.out.println("Lint Test is: "+ lt);
		}

	}

}
