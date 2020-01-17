package com.java.basics;

public class TwoDimeArray {

	public static void main(String[] args) {
		String x[][] = new String[3][5];
		System.out.println(x.length); // Total no. rows
		System.out.println(x[0].length); // Total no.coloumns
		//first row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		//x[0][5]="F";
		//2 row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		//3 row
		
		x[2][0]="AA";
		x[2][1]="BB";
		x[2][2]="CC";
		x[2][3]="DD";
		x[2][4]="EE";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		
		//print all the values of 2nd array use for loop
		
		for(int row=0;row<x.length;row++)
		{
			for (int col=0;col<x[0].length;col++)
               {
	System.out.println(x[row][col]);
}
		}
		
	}

}
