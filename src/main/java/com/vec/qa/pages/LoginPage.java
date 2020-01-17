 /* package com.vec.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vec.qa.base.TestBase;

//Webdriver driver = new FireFoxDriver();

public class LoginPage extends TestBase {
	//Page Factory OR
	@FindBy(name="userId")
	WebElement userId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signin;
	
	@FindBy(xpath="//img[contains(@class,'logo')]")
	WebElement verizonlogo;
	
	//Initializing the Page Objects
	public LoginPage()
	{
		WebDriver driver;
		//PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String validateLoginPageTitle()
	{
		WebDriver driver;
		return driver.getTitle();
	}
	
	public boolean validateImage(){
		return verizonlogo.isDisplayed();	
	}
public HomePage login(String un,String pwd) {
	userId.sendKeys(un);
	password.sendKeys(pwd);
	signin.click();
	return new HomePage();
}







} */
