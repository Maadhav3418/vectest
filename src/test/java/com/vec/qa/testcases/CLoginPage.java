package com.vec.qa.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.selenium.practice.BasicWebDriver;
import com.vec.qa.util.TestUtil;

public class CLoginPage {
	public static String  browserName;
	public static String title;
	public static WebDriver driver=null;
	
	public static void initialization() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		 driver = new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);	
	   System.out.println("initialization method end");		
	
	}
public static void loginToApplication() throws Exception
{
		System.out.println("LoginToApplication method called:");
		Thread.sleep(200);
		driver.findElement(By.name("LoginForm[username]")).sendKeys("madhavaraon");
		driver.findElement(By.name("LoginForm[password]")).sendKeys("@DWS1014");
		Thread.sleep(200);
		//driver.findElement(By.name("yt0")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("LoginToApplication method End:");		
}
	
	public static void main(String[] args) throws Exception
		{
		CLoginPage  lp =new CLoginPage();
		lp.initialization();
		lp.loginToApplication();
	   //driver.quit();		
    	}

	}
	


