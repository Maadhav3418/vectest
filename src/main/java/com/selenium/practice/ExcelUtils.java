package com.selenium.practice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	static int reqcellrowno;
	static int reqcellcolno;
	String CellData;

//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file
Path="D:\\ProjectNew\\FLV.xlsx";
FileInputStream ExcelFile = new FileInputStream(Path);
// Access the required test data sheet
ExcelWBook = new XSSFWorkbook(ExcelFile);
ExcelWSheet = ExcelWBook.getSheet(SheetName);
System.out.print("Xls Opned");
		
}
catch (Exception e){

			throw (e);

		}

}
}
/*
 
//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

			}catch (Exception e){

			return"";

			}

}

//This method is to write in the Excel cell, Row num and Col num are the parameters

@SuppressWarnings("static-access")
public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

		try{

			Row  = ExcelWSheet.getRow(RowNum);

		Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

		if (Cell == null) {

			Cell = (XSSFCell) Row.createCell(ColNum);

			Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}
		
		
		

// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(Paths.Path_TestData + Paths.File_TestData);

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			}catch(Exception e){

				throw (e);

		}

	}


public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
	int i;
    try {
	    int rowCount = ExcelWSheet.getLastRowNum();
        for ( i=0 ; i<rowCount; i++){
	        if  (ExcelUtils.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){
	            break;
	           }
	        }
        return i;
    }catch (Exception e){
	    LogUtility.error("Class ExcelUtil | Method getRowContains | Exception desc : " + e.getMessage());
        throw(e);
	    }
    }

public static int getRowUsed() throws Exception {
	 
	try{

		int RowCount = ExcelWSheet.getLastRowNum();

		LogUtility.info("Total number of Row used return as &lt; " + RowCount + " &gt;.");		

		return RowCount;

	}catch (Exception e){

		LogUtility.error("Class ExcelUtil | Method getRowUsed | Exception desc : "+e.getMessage());

		System.out.println(e.getMessage());

		throw (e);

	}

}

public static String getExcelData(String columnname,String rowname)
{
	
	ArrayList<String> testcasenamedata = new ArrayList<String>();
	ArrayList<String> colnamedata = new ArrayList<String>();
	
	int writtenrowno= ExcelWSheet.getPhysicalNumberOfRows();
	//System.out.println(writtenrowno);
	Row =  ExcelWSheet.getRow(0);
	int writtencolno= Row.getLastCellNum();
	//System.out.println(writtencolno);
	boolean rowFound = false;
	boolean colFound = false;
	
	for(int i=0;i<writtenrowno;i++)
	{
		Row =  ExcelWSheet.getRow(i);
		Cell = Row.getCell(0);
		testcasenamedata.add(Cell.getStringCellValue());
		if(rowname.equalsIgnoreCase(testcasenamedata.get(i)))
		{
			reqcellrowno=i;
			rowFound = true;
			break;
		}
	    //System.out.println(testcasenamedata.get(i));
		
	}
	for(int j=0;j<writtencolno;j++)
	{
		Row =  ExcelWSheet.getRow(0);
		Cell= Row.getCell(j);
		colnamedata.add(Cell.getStringCellValue());
		if(columnname.equalsIgnoreCase(colnamedata.get(j)))
		{
			reqcellcolno=j;
			colFound = true;
			break;
		}
		//System.out.println(colnamedata.get(j));
	}
	String CellData = "";
	if (rowFound && colFound){
		Cell = ExcelWSheet.getRow(reqcellrowno).getCell(reqcellcolno);
		if (Cell != null){
			Cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
			CellData = Cell.getStringCellValue();
		}
		else
			CellData = "";
	}
	return CellData;
}




public static void setExcelData(String ExcelPath,String columnname,String rowname,String cellValue) {
try{
	ArrayList<String> testcasenamedata = new ArrayList<String>();
	ArrayList<String> colnamedata = new ArrayList<String>();
	int writtenrowno= ExcelWSheet.getPhysicalNumberOfRows();
	Row =  ExcelWSheet.getRow(0);
	int writtencolno= Row.getLastCellNum();
	for(int i=0;i<writtenrowno;i++)
	{
		Row =  ExcelWSheet.getRow(i);
		Cell = Row.getCell(0);
		testcasenamedata.add(Cell.getStringCellValue());
		if(rowname.equalsIgnoreCase(testcasenamedata.get(i)))
		{
			reqcellrowno=i;
			break;
		}
		
	}
	for(int j=0;j<writtencolno;j++)
	{
		Row =  ExcelWSheet.getRow(0);
		Cell= Row.getCell(j);
		colnamedata.add(Cell.getStringCellValue());
		if(columnname.equalsIgnoreCase(colnamedata.get(j)))
		{
			reqcellcolno=j;
			break;
		}
	}
	Cell = ExcelWSheet.getRow(reqcellrowno).getCell(reqcellcolno);
	if (Cell == null) {
		Cell = ExcelWSheet.getRow(reqcellrowno).createCell(reqcellcolno);
		Cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
		Cell.setCellValue(cellValue);
	} 
	else {
		Cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
		Cell.setCellValue(cellValue);
	}
	FileOutputStream fileOut = new FileOutputStream(ExcelPath);
	ExcelWBook.write(fileOut);
	fileOut.close();
}
catch(Exception e){
	System.out.println("Error while setting the data "+e.getMessage());
}

}

public static int getRowcount()
{

	return ExcelWSheet.getPhysicalNumberOfRows();
}
   
public static int getLastrownum()
{
	return ExcelWSheet.getLastRowNum();
}
 
} */
