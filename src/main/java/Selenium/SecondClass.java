package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
//		WebElement ele = driver.findElement(By.id("vfb-7-2"));
//		ele.click();
		
		
		for(int i=1;i<=3;i++)
		{
			//String xpath = "(//input[@type='radio'])["+i+"]";
			WebElement ele1 = driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]"));
			if(i<=2)
			{
				ele1.click();
			}
			else
			{
				System.out.println("Can't find!");
			}
			
		}
	}

}
