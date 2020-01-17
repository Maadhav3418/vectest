package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws Exception {
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
driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
System.out.println("Contacts link pressed:");

////*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
String before_xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[";
String after_xpath ="]/td[2]/a";
for (int i=4;i<=7;i++)
{
	String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
	System.out.println(name);
	if(name.contains("Reports")) {
		driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+ i +"]/td/[1]/input")).click();
		}
}

//method 2
driver.findElement(By.xpath("//a[contains(text(),'Reports')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Ravi')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
}

}
