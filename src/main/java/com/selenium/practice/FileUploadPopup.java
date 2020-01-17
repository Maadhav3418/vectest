package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		//type = file should be present for browse/ Attachfile/upload file button
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\ProjectNew\\FLV.xlsx");

	}

}
