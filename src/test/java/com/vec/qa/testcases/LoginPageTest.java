/* package com.vec.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vec.qa.base.TestBase;
import com.vec.qa.pages.HomePage;
import com.vec.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}
	@Test(priority=1)
	public void loginpageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title,"Verizon business account login");
	}
	
	@Test(priority=2)
	public void logoImageTest()
	{
		boolean flag= loginpage.validateImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest()
	{
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}  */
