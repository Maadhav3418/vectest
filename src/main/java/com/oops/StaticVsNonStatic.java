package com.oops;

public class StaticVsNonStatic {

	//global variables :the scope of global varaible will be available across all the functions with some conditions.
	
	String name = "Ravisankar";  //non static var
	static int age =25; //static global vari
	
	
	public void sendMail()  //non static method
	{
		System.out.println("send mail method:");
	}
	
	public static void sum() //static method
	{
		System.out.println("static method:");
	}
	
	

	
	public static void main(String[] args) {
		// How to call static methods and vars?
		//1.Direct  calling;
		sum();
		
		//2.calling by className
		StaticVsNonStatic.sum();
		System.out.println(age);
		//how to call non-static  methods and var
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		//can i access static methods by using object reference ? yes
		obj.sum();  //warning will be given
		
	}
}
