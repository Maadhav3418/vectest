package com.selenium.practice;
import java.io.IOException;

import com.testautomationguru.utility.PDFUtil;
public class PDFReader {

public static void main(String[] args) throws IOException {
PDFUtil pdfUtil = new PDFUtil();
int i =pdfUtil.getPageCount("D:/Holiday Calendar List - 2019 - India.pdf");
System.out.println("The Total No.of Pages :" + i);
		
}

}