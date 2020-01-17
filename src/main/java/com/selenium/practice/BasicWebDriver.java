package com.selenium.practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.security.auth.login.LoginException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.j2objc.annotations.Property;

public class BasicWebDriver {
	public static Properties prop;
	public static String  browserName;
	public static String title;
	public static WebDriver driver=null;
	
	public void ReadProper() throws IOException
	{
		prop = new Properties();
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		FileInputStream ip = new FileInputStream("C:\\Users\\madhavaraon\\SeleniumTest\\VECTest\\src\\main\\java\\com\\vec\\qa\\config\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		String browserName=prop.getProperty("browser");
		System.out.println("browsername:"+ browserName);
		//driver.get(prop.getProperty("url"));
		if(browserName.equals("chrome")) {
			System.out.println("inside_loop");
			System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("FireFox"))
			{
				System.setProperty("webdriver.firefox.driver","D:\\Documents\\Softwares\\geckodriver-v0.20.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
				
		else {
			System.out.println("No Browser Value Specified");
		}
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		title =driver.getTitle();
		System.out.println("Title is : "+title);
		System.out.println("Current URL is : "+driver.getCurrentUrl());
		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("yt0")).click();
		
		}
		
	  /* 
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//browserName=prop.getProperty(key, defaultValue)
		//browserName = prop.getProperty("browser");
		//driver.get(prop.getProperty("url"));
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		title =driver.getTitle();
		System.out.println("Title is : "+title);
		System.out.println("Current URL is : "+driver.getCurrentUrl());

		if(title.equals("Maveric Systems Ltd. - Login"))
		{
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		//System.out.println(driver.getPageSource());
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);	
			
	}
	
	public void loginToApplication()
	{
		driver.findElement(By.name("LoginForm[username]")).sendKeys("madhavaraon");
		driver.findElement(By.id("LoginForm_password")).sendKeys("@Hasittha");
		driver.findElement(By.name("yt0")).click();
		
	}
		 */
	public static void main(String[] args) throws IOException
		{
		BasicWebDriver  ltapp =new BasicWebDriver();
	    ltapp.ReadProper();
	    //ltapp.initialization();
		//ltapp.loginToApplication();
		//driver.quit();		
	}

}

