package com.selenium.practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import pageObjects.Customer_Page;
//import utilities.ExcelReader;

public class POM_TC extends ExcelReader {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Documents\\Softwares\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	POM_TC pom = new POM_TC();
	Object name = null;
	String value=null;
	Customer_Page.checkFieldType(name);
	Customer_Page.verifyEnabled();
	Customer_Page.checkLabelName(name);
	Customer_Page.verifyVisible();
	Customer_Page.verifyEditable();
	Customer_Page.verifyMandatory();
	Customer_Page.verifyEditable();
	Customer_Page.selectValueByarrowKey();
	Customer_Page.verifyblankEnter();
	Customer_Page.checkSpellCheck(value);
	Customer_Page.checkAlignment(value);
	Customer_Page.selectValueByMouse();
	Customer_Page.checkBlank();
	Customer_Page.ValueCheck();
	}

}
