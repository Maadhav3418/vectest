package com.java.basics;

public class ArrayConcept {

	public static void main(String[] args) {
		//array : to store similar data type values in a array variable
		
		// 1. int array:
		//lowest bound /index =0;
		//upper bound/index =n-1; (n size of array)
		// one dimentational array
		//dis-advantages:
		// size is fixed -static array
		// Stores only similar data types ; double u need to use double
		
		//
		int i []= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);  //size length of loop
		for ( int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		//2. double array:
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		System.out.println(d[2]);
		
		//3.char array:
		char c[] = new char[3];
		c[0]='M';
		c[1]=2;
		c[2]='$';
		
		//4.boolean array
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String Array
		String s[] = new String[3];
		s[0]= "Test";
		s[1]="RaviSankar";
		s[2]="FileEdit";
		System.out.println(s.length);
		
//6.Object array : object is a class -- used to store different data types values
		
		Object ob[]= new Object[6];
		ob[0]="Maadhav";
		ob[1]=25;
		ob[2]=15.55;
		ob[3]="30/04/2019";
		ob[4]="M";
		ob[5]="Maveric";
		//ob[6]="Increment";
		System.out.println(ob[5]);
		System.out.println(ob.length);
	}

}
