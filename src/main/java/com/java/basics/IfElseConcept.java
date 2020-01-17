package com.java.basics;

public class IfElseConcept {

	public static void main(String[] args) {
int a=10, b=30;

if(a>b)
{
	   System.out.println("a is greater then b ");
	   
}
else {
	   System.out.println("b is greater then a");
}


//comparision operator
// <> <= >= == !=

int c= 40, d=50;

if(c==d)
{
	   System.out.println("c and d are equal");
	   		
}
else {
	   System.out.println("c and d are not equal");
}


//write a logic to find out the  higest Number

int a1 =300, b1=400, c1=500;

//nested if 

if(a1>b1 & a1>c1)    //false & true = false
{
	   System.out.println("a is greatest");
}
else if(b1>c1)
	   {
	System.out.println("b is greatest");
	}
	else
	{
			   System.out.println("c is greates");
}
}
}
