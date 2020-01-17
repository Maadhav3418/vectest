package com.oops;

public class Cycle {

	//class var
	int mod;
	int wheel;
	

	public static void main(String[] args)
	{
		//new Cycle(); this is the object of cycle class
		//new keyword is  used to create object
		//a,b,c --> object reference variables
		
		Cycle a =new Cycle();
		Cycle b =new Cycle();
		Cycle c =new Cycle();
		Cycle d =new Cycle();
		
		a.mod=2019;
		a.wheel=2;
		System.out.println(a.mod);
		System.out.println(a.wheel);
			b.mod=2010;
		b.wheel=3;
		System.out.println(b.mod);
		System.out.println(b.wheel);
	
		c.mod=2018;
		c.wheel=4;
		System.out.println(c.mod);
		System.out.println(c.wheel);
	
		d.mod=2009;
		d.wheel=22;
		System.out.println(d.mod);
		System.out.println(d.wheel);
		
		
		System.out.println("Before assing the reference:");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("after assing the reference:");
		
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
	}
}
