package com.selenium.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.gecko.driver","D:\\Documents\\Softwares\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.findElement(By.name("username")).sendKeys("madhavaiqa");
		driver.findElement(By.name("password")).sendKeys("@Sairam123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.switchTo().frame("mainpanel");
//links - a reference
//images--//image href

//1.get the list of all the links and images
 List<WebElement> links = driver.findElements(By.tagName("a"));

links.addAll(driver.findElements(By.tagName("img")));
System.out.println("Size of the links and Images :" +links.size());
List<WebElement> activeLinks = new ArrayList<WebElement>();
//2.Iterate the links exclude all the links/images -doesnt have any href attribute
for (int i=0;i<links.size();i++)
{
	if (links.get(i).getAttribute("href")!=null &&(!links.get(i).getAttribute("href").contains("javascript"))&&(!links.get(i).getAttribute("href").contains("help.crmpro.com")))
	{
		activeLinks.add(links.get(i));
	}
}

System.out.println("Size of ActiveLinks and Images:"+activeLinks.size() );

//3. check for the href URL
for (int j=0;j<activeLinks.size();j++) {
	
	HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
	connection.connect();
	Thread.sleep(200);
	String response = connection.getResponseMessage();
connection.disconnect();
System.out.println(activeLinks.get(j).getAttribute("href")+ "---->"+ response);
	}
	}
}

