package com.selenium.practice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hslf.usermodel.*;
public class ReadExcel
{
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public  ReadExcel(String excelPath)
	{
	  try 
	      {
		File src=new File("D:\\ProjectNew\\FLV.xlsx");
		FileInputStream fis=new FileInputStream(src);
		wb= new XSSFWorkbook(fis);  //as used .xlsx  if .xls we need to use HSSFWorkbook
		XSSFSheet sheet1=wb.getSheetAt(0);
	int rowcount=sheet1.getLastRowNum();
	
		System.out.println("Totla Number of Row"+ rowcount+1);
		for (int i =0; i<=rowcount;i++)
		{
			 String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			// String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
			  //System.out.println("Data from Xls is :"+ data1);
			  System.out.println("Header A is :"+ i + "is " + data0);
			  //+   "Header B is :" + i + "is " + data1);
		}
        wb.close();
	      }  
	  catch (Exception e)
	   {
		System.out.println(e.getMessage());
	   }
	}


public String getData(int SheetNumber,int row,int coloumn)
{
	sheet1=wb.getSheetAt(SheetNumber);
	String data=sheet1.getRow(row).getCell(coloumn).getStringCellValue();
	return data;
}
public static void main(String args[])
{
	ReadExcel re=new ReadExcel("D:\\ProjectNew\\FLV.xlsx");
	System.out.println(re.getData(1,0,1));
	
}

}