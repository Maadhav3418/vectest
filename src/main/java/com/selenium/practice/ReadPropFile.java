package com.selenium.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {

Properties prop = new Properties();
//FileInputStream ip =new FileInputStream("C:\\Users\\madhavaraon\\SeleniumTest\\VECTest\\src\\main\\java\\com\\selenium\\practice\\config.properties");
FileInputStream ip= new FileInputStream("C:\\Users\\madhavaraon\\SeleniumTest\\VECTest\\src\\main\\java\\com\\vec\\qa\\config\\config.properties");
prop.load(ip);
//System.out.println(prop.getProperty("name"));
//System.out.println(prop.getProperty("qualification"));
//System.out.println(prop.getProperty("url"));
//System.out.println(prop.getProperty("browser"));
	String browser =prop.getProperty("browser"); 
if(browser.equals("chrome")) {
	System.out.println("inside_loop");
	System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
	 driver = new ChromeDriver();
}
else if (browser.equals("FireFox"))
	{
		System.setProperty("webdriver.firefox.driver","D:\\Documents\\Softwares\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
		
else {
	System.out.println("No Browser Value Specified");
}
System.out.println(prop.getProperty("url"));
driver.get("url");
driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
driver.findElement(By.name(prop.getProperty("login_name"))).click();
	}
}