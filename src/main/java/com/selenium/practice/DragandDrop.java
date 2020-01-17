package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		 // Thread.sleep(300);
   driver.switchTo().frame(0);
  // Thread.sleep(3000);
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
	//action.clickAndHold(driver.findElement(By.xpath("//*[id='droppable']")));
	driver.navigate().refresh();
	
	driver.navigate().to("https://www.amazon.com");
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver,1);
	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-your-amazon")));
	ele.click();
	
	}


}
