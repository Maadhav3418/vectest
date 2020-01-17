package com.selenium.practice;

import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.eventusermodel.XSSFBReader;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import de.bezier.data.XlsReader;

public class WebTableHandle {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		String beforeXPath= "//*[@id='customers']/tbody/tr[";
		String afterXpath= "]/td[1]";
		String beforeXPath_contact= "//*[@id='customers']/tbody/tr[";
		String afterXpath_contact= "]/td[2]";
		
		List<WebElement> rows =driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total number of Rows: = " + (rows.size()-1));
		int rowCount=rows.size();
 /* XlsReader reader =new XlsReader("C:/Users/madhavaraon/SeleniumTest/VECTest/" 
		+ "src/main/java/com/vec/qa/testdata/testdata.xlsx");	
if(!reader.isSheetExict("TableData"))
{
	reader.addSheet("TableData");
	reader.addColumn("TableData","CompanyName");
	reader.addColumn("TableData","ContactName");
	
}	*/
		
		for (int i=2;i<=rowCount;i++)
		{
			String actualXpath=beforeXPath+i+afterXpath;
			String companyName=driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(companyName);
			//reader.setCellData("TableData","CompanyName",i,companyName);
			String actualXpath_contact=beforeXPath_contact+i+afterXpath_contact;
			String contactname=driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(contactname);
			//reader.setCellData("TableData","CompanyName",i,companyName);
			re
		}
	}

}
