package com.oops;

public class LocalVsGlobalVariables {

	//Global vars-class variable
	String name="Maadhav";
	int age =28;
	
	
	public static void main(String[] args) 
	{
		int i=10; // local var
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sum();
	}

	public void sum()
	{
	int i=25;
	int j =20;
	System.out.println(i);
	System.out.println(j);
	}
}
