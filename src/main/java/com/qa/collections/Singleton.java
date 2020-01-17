package com.qa.collections;

public class Singleton {

	// It is a class that can have only one object at time, if we are trying to create another instance/object it will point the same.
	//How to create Singleton
	//1.make constructor as private
	//2.write a public static method that has return type of object of this singleton class
	//(Lazy Initialization)
	
	//Difference btwn normal class and singleton class
	//for Normal class we use constructor where as for singleton class we use getInstance() method for Initialization
	
	//if driver is null then only create the object
	private static Singleton singleton_instance=null;
	public String str;
	
	private Singleton() {
		str="This is Singleton pattren Test";
	}
	
	public static Singleton getInstance()
	{
		if(singleton_instance == null)
			singleton_instance= new Singleton();
		return singleton_instance;
	}
public static void main(String[] args)
{
	Singleton x = 	Singleton.getInstance();
	Singleton y = 	Singleton.getInstance();
	Singleton z = Singleton.getInstance();
	
	x.str=(x.str).toUpperCase();
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	z.str=(x.str).toLowerCase();
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
}
	
	
}
