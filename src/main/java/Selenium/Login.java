package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	static WebDriver a;
	public static void main(String[] args) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		a=new ChromeDriver();
		a.get("http://demo.guru99.com/test/login.html");
		a.manage().window().maximize();
		WebElement ele1 = a.findElement(By.id("email"));
		if(ele1.isDisplayed())
		{
		ele1.sendKeys("Ärun Kumar K");
		}
		a.findElement(By.id("passwd")).sendKeys("Qwerty12");	
		WebElement ele = a.findElement(By.id("SubmitLogin"));
		//ele.click();
		Login.takeScreenshot();
		if(ele.isDisplayed())
			{
				ele.click();
			}
		
		else
			{
				System.out.println("Not Found");
			}
		
		a.close();
		
	}
	
	public static void takeScreenshot() throws IOException
	{
		TakesScreenshot screenshot = ((TakesScreenshot)a);
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\madhavaraon\\Desktop\\Screenshot\\newimage.png");
		FileUtils.copyFile(src, dest);
	}

	
}
