package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.get("https://sso.verizonenterprise.com/amserver/sso/login.go?appGroup=VZB&goto=https%3A%2F%2Fenterprisecenter.verizon.com%3A443%2F&RequestID=32569&MajorVersion=1&MinorVersion=0&ProviderID=https%3A%2F%2Fenterprisecenter.verizon.com%3A443%2Famagent&IssueInstant=2019-03-22T10%3A14%3A08Z");
		driver.findElement(By.name("proceed")).click();
		//driver.findElement(By.className("primary")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text =alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct Error Message:" + text);
		}
		else
		{
			System.out.println("Incorrect Error Message");
		}
		alert.accept();
		
	}

}
