package com.vec.qa.testdata;

import com.selenium.practice.ReadExcel;
import com.vec.qa.lib.*;
public class ExcelRead{
	
	public static void main(String args[])
	{
		ReadExcel re=new ReadExcel("D:\\ProjectNew\\FLV.xlsx");
		System.out.println(re.getData(1,0,1));
	}
	
}
