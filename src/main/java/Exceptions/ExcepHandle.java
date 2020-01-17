package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExcepHandle {
	
	private static final Exception Exception = null;
	public void excep() throws java.lang.Exception {

		
		
try {
	int a=5,b=0;
 if(a!=b) {
	 throw new java.lang.Exception("Not equal", Exception);
//	 System.out.println("Values are equal");
	 
 }
		
}catch(Exception e) {
 System.out.println("Values are not equal " +e);	
}
	}
public static void main(String args[]) throws java.lang.Exception {
	
	ExcepHandle ex=new ExcepHandle();
	ex.excep();
}
}
