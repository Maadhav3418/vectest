package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vec.qa.util.TestUtil;

public class Navigation {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get("https://www.audible.in");
		System.out.println("1.audible site");
		driver.get("https://www.google.com/");
		System.out.println("2.Google site");
		driver.navigate().to("https://www.amazon.com");
		System.out.println("3.amazon site");
		//back and forward simulation
		driver.navigate().back();
		Thread.sleep(200);
		System.out.println("2.Google site");
		Thread.sleep(200);
		driver.navigate().back();
		System.out.println("1.audible site");
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

}
