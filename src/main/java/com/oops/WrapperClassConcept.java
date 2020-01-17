package com.oops;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x = "101";
System.out.println(x+200);

//data conversion :String to int;
int i = Integer.parseInt(x);
System.out.println(i+20);

//integer,double,character,boolean

//String to double conversion:
String y ="12.33";
double d = Double.parseDouble(y);
System.out.println(d+10);

//String to boolean conversion:
String k = "true";
boolean b= Boolean.parseBoolean(k);
System.out.println(b);

//int to String conversion:
int j=200;
System.out.println(j+200);
String s = String.valueOf(j);
System.out.println(s+20);

String a = "101";
Integer.parseInt(a);
System.out.println(a);

String r= "Maadhav";
System.out.println(r+200);
	
//String e = "20A";     ////NumberFormatException
//Integer.parseInt(e);
//System.out.println(e);
	
	}

}
