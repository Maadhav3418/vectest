package com.selenium.practice;
import  java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader  {
//private static final int Scenario1 = 0;
//Hd, String[] Bd, String[] EP
//String ExcelFilePath="D:\\ProjectNew";
//String FileName = "FLV.xlsx";
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	XSSFCell Cell;
	public void XlsRead() throws IOException
	{
		
			File src=new File("D:\\ProjectNew\\FLV.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb= new XSSFWorkbook(fis);  //as used .xls
			XSSFSheet sheet1=wb.getSheetAt(0);
		  String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		  String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		  System.out.println("Data from Xls is :"+ data0);
		  System.out.println("Data from Xls is :"+ data1);
		  wb.close();
			
			//	ExcelWSheet = ExcelWBook.getSheet(SheetName);
			
			
			//************************************************************
			/*if(!new File(ExcelFilePath+FileName+".xlsx").isFile()){
				XSSFWorkbook wb=new XSSFWorkbook();
				XSSFSheet sheet=wb.createSheet("Sheet1");
				wb.getSheetName(Scenario1);
				XSSFRow row=sheet.createRow(0);
				row.createCell(0).equals("Scenario_Flow");
				System.out.print("FirstRow Selected");
			    int rowNum=sheet.getLastRowNum();	
				XSSFRow row1=sheet.createRow(rowNum+1);
				//row1.createCell(0).setCellValue(Arr +"\n" ); 
				//row1.createCell(0).setCellValue(EP +"\n"+ Bd +"\n"+ Hd); 
				FileOutputStream outputstream= new FileOutputStream(new File(ExcelFilePath+FileName+".xlsx"));   
				wb.write(outputstream);
				outputstream.close();
				wb.close();
			}
			else{
				FileInputStream fin=new FileInputStream(new File(ExcelFilePath+FileName+".xlsx"));
				XSSFWorkbook wb=new XSSFWorkbook(fin);
				XSSFSheet sheet=wb.getSheet("Sheet1");
				int rowNum=sheet.getLastRowNum();
				XSSFRow row1=sheet.createRow(rowNum+1);
				//row1.createCell(0).setCellValue(Arr +"\n" );
				//row1.createCell(1).setCellValue(EP +"\n"+ Bd +"\n"+ Hd); 
				FileOutputStream outputstream= new FileOutputStream(new File(ExcelFilePath+FileName+".xlsx"));   
				wb.write(outputstream);
				outputstream.close();
				wb.close();
			}
			//************************************************************
	        System.out.println("Your excel reached End");
		}catch(Exception ex){
			System.out.println(ex);
		}*/
		
	}

	public void getCellData(int RowNum, int ColNum)
	{
		Cell = sheet1.getRow(0).getCell(0);
		String CellData = Cell.getStringCellValue();
		System.out.println("The CellData is " +CellData );
		//return(CellData);

	}

			


	
public static void main(String[] args) throws IOException 
{
	ExcelReader  er= new ExcelReader();
	er.XlsRead();
	er.getCellData(0,0);
}

}

