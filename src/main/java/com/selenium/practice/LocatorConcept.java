package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
System.out.println("Singinpage:");

//1.xpath:

//driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Maadhav");
//driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Rao");
//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("helptest");
//System.out.println("xPath:");

//2.id
//driver.findElement(By.id("firstName")).sendKeys("Maadhav");
//driver.findElement(By.id("lastName")).sendKeys("Rao");
//System.out.println("Id Locatoer Test:");

//3.Name
driver.findElement(By.name("firstName")).sendKeys("Help");
driver.findElement(By.name("lastName")).sendKeys("Like");
System.out.println("Name Locator Test:");	

//4.linkTest :  only for links

//driver.findElement(By.linkText("Sign in instead")).click();
//System.out.println("LinkTest Locator Test:");

//5.PartialLinkTest  : Not usefull for links

//driver.findElement(By.partialLinkText("Sign")).click();
//System.out.println("PartialLinkTest Locator Test:");

//6.cssSelector :
driver.findElement(By.cssSelector("#firstName")).sendKeys("Help");
driver.findElement(By.cssSelector("#lastName")).sendKeys("Like");
System.out.println("cssSelector Locator Test:");
	}

	
}
