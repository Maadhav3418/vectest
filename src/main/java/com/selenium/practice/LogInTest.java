package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vec.qa.util.TestUtil;

public class LogInTest {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.gecko.driver","D:\\Documents\\Softwares\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String title =driver.getTitle();
		System.out.println("Title is : "+title);
		System.out.println("Current URL is : "+driver.getCurrentUrl());

		if(title.equals("Maveric Systems Ltd. - Login"))
		{
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);	
		System.out.println("LoginToApplication method called:");
		Thread.sleep(200);
		driver.findElement(By.name("LoginForm[username]")).sendKeys("madhavaraon");
		driver.findElement(By.name("LoginForm[password]")).sendKeys("@DWS1014");
		//driver.findElement(By.id("//*[@id='LoginForm_username']")).sendKeys("madhavaraon");
		//driver.findElement(By.id("//*[@id='LoginForm_password']")).sendKeys("@DWS1014");
		Thread.sleep(200);
		//driver.findElement(By.name("yt0")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("LoginToApplication method End:");

	}

}
