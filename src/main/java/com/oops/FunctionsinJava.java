package com.oops;

public class FunctionsinJava {
	//main method -->starting point of execution

	public static void main(String[] args) {
		//one object will be created, obj is the reference variable, referring to this object
		//after creating the object,the copy of all non static methods will be given to this object
		//main method is void -. it will never returns a value
		FunctionsinJava  obj = new FunctionsinJava();
		obj.test();
		int t=obj.pqr();
		System.out.println(t);
		obj.name();
		int div =obj.division(3, 1);
		System.out.println(div);
		
	}
		
	//non static methods
			//void -- does not return any value
			//return type =void
	public void test() //no input, no output
		{
			System.out.println("Test method:");
		}
//return type =int
		public int pqr() //no input,some output
		{
			System.out.println("PQR Method:");
			int a =10;
			int b=20;
			int c =a+b;
			return c;
			
		}
		//return type ->String
		public String name()
		{
			System.out.println("QA TEST Method:");
			String s ="Selenium";
			return s;
		}
		//retun type--> int
		//x,y-->input parameters/argumnets
		public int division(int x,int y)
		{
			System.out.println("Division method:");
			int d=x/y;
			return d;
		}
		
}


