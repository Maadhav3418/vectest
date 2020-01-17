package com.selenium.practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customer_Page implements WebDriver


{

	public void close() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.manage().window().maximize();
       driver.close();
		
	}

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void checkFieldType(Object name)
	{
		WebDriver driver = new FirefoxDriver();
		driver.findElement(By.cssSelector("input[type='text']"));  /* To checkFieldType(name)*/
	    int i = driver.findElements(By.cssSelector("input[type='text']")).size(); //To Check All Fileds in page
	    System.out.println(i);
	 		
	}
	
	public static void verifyEnabled() {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("www.google.com");
		driver.manage().window().maximize();
		if( driver.findElement(By.name("Submit")).isEnabled()){
		driver.findElement(By.name("Submit")).click();	
        System.out.println("Element is Enable");
			}else
			{
			System.out.println("Element is Disabled");
			}
		driver.close();
		}
	public static void checkLabelName(Object name)
	{
		/*WebDriver driver = new FirefoxDriver();
		List<WebElement> list;
		list= driver.findElements(By.xpath("//*[@id='row']/td/b"));

		for(int i=0;i<list.size;i++){

		   list.get(i).getText();8 */
		  }		
		
		
	public static void verifyEditable() {
	}
		
	public static void verifyVisible() {
		WebDriver driver = new FirefoxDriver();
		if(driver.findElement(By.name("Submit")).isDisplayed())
		{
            driver.findElement(By.name("Submit")).click();
			System.out.println("Element is Visible");
		}else
		{
			System.out.println("Element is InVisible");
		}
	
		driver.close();
	}


	public static void selectValueByarrowKey() {
		// TODO Auto-generated method stub
		
	}

	

	public static void ValueCheck() {
		// TODO Auto-generated method stub
		
	}

	public static void checkBlank() {
		// TODO Auto-generated method stub
		
	}

	public static void checkAlignment(String value) {
		// TODO Auto-generated method stub
		
	}

	public static void checkSpellCheck(String value) {
		// TODO Auto-generated method stub
		
	}

	public static void verifyblankEnter() {
		// TODO Auto-generated method stub
		
	}

	public static void verifyMandatory() {
		// TODO Auto-generated method stub
		
	}
	
	public static void selectValueByMouse()
	{
		
	}
	
	public static void options()
	{
	
}
}

