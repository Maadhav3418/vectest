package com.selenium.practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripterExecutor {
	WebElement loginBtn;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
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
		//executeScript ->To Execute JavaScript Code
		//WebElement loginBtn = driver.findElement(By.xpath("//input[@type,'submit']")).click();
		//flash(loginBtn,driver);
		//drawBorder(loginBtn,driver);
		
	}
	
		public static void flash(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String bgcolor = element.getCssValue("bagroundcolor");
			for (int i=0 ; i <100; i++)
			{
				changeColor("rgb(0,200,0",element,driver);
				changeColor(bgcolor,element,driver);
			}
		}

		private static void changeColor(String color, WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor= '"+ color+"'",element);
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		
		public static void drawBorder(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.boarder='3px solid red'",element);
			
		}
	}
	
	
	


