package com.selenium.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;


public class FindStringinXls {
	
	public void ReadValues() throws IOException {
		
	String fileName = "D:\\BankStatement.xls";
    String cellContent = "MUM-";
   // int rownr=0, colnr = 10;
    Cell cell = null;
    InputStream input = new FileInputStream(fileName);
    HSSFWorkbook wb = new HSSFWorkbook(input);
    HSSFSheet sheet = wb.getSheetAt(0);
    for (Iterator<Row> rit = sheet.rowIterator(); rit.hasNext();)
    {
        Row row = rit.next();
        for (Iterator<Cell> cit = row.cellIterator(); cit.hasNext();)
        {
            cell = cit.next();
            // Print the each cell value
             System.out.println("Cell Value : " + cell.getStringCellValue());
         }
    
    }
    System.out.println("Total No. of Rows with values : " + cell.getSheet().getLastRowNum());
	}
public static void main(String[] args) throws IOException{
	
	FindStringinXls fsx =new FindStringinXls();
    fsx.ReadValues();    
}

}





