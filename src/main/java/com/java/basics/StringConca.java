package com.java.basics;

public class StringConca {

	//+ is concatenation operator
	//println - is used to print on the console with a new line
	//print - is just used to print on the same console
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=30;
		String x = "Hello";
		String y = "Maadhav";
		double c =12.33;
		double d=10.33;
		System.out.println(a+b); //40
        System.out.println(x+y); //HelloMaadhav
        System.out.println(a+b+x+y);//40HelloMaadhav
        System.out.println(x+y+a+b);//HelloMaadhav1030
        System.out.println(x+y+(a+b));//HelloMaadhav40
        System.out.println(a+b+x+y+a+x+b+y); //40HelloMaadhav10Hello30Maadhav
        System.out.println(a+b+x+y+a+b); //40HelloMaadhav1030
        System.out.println(c+d);
        System.out.println(x+y+c+d);
        System.out.println("Hello Maveric...");
        System.out.println("The value is :" +a);
        System.out.println("The Addition is "+(c+d));
	
	
	}

}
