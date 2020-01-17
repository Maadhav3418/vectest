package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.get("https://classic.crmpro.com/register/");
		//1.isDisplayed() is applicable for all the elements
		//boolean b1 = driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		boolean b1 = driver.findElement(By.name("submitButton")).isDisplayed();
		System.out.println(b1);
		
		//2.isEnabled()
		boolean b2 = driver.findElement(By.name("submitButton")).isEnabled();
		System.out.println(b2);
		
	//Select I Agree Checkbox
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3 = driver.findElement(By.name("agreeTerms")).isEnabled();
		System.out.println(b3);
		
		//3 is Selected() method only applicable for checkbox,dropdown,radiobutton
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
				System.out.println(b4);		
		
	}

}
