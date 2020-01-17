package com.selenium.practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

//import com.apache.commons.io.FileUtils;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vec.qa.util.TestUtil;

public class TakeScreenshot {
	
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	driver.get("https://www.audible.in");
	
	//take the screenshot and store as file format
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//Copy the screenshot to desired location using copyfile 
//FileUtils.copyFile(src,new File("C:/Users/madhavaraon/SeleniumTest/VECTest/src/main/java/com/selenium/practice/audible.png"));
	
	}
	
}
