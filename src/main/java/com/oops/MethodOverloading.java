package com.oops;

public class MethodOverloading {

	//method overloading :same name with Different arguments or input parameters within the same class.
	//we can not create a method inside the method
	//duplicate methods -i.e. same method name with same number of arguments are not allowed
	
	public void sum()  //0 input param
	{
		System.out.println("SUM method ->Zero Param");
	}
	
	public void sum(String i)  //1 input param
	{
		System.out.println("SUM method ->One Param");
	}
	
	public void sum(int a,int b)  //2 input param
	{
		System.out.println("SUM method ->Two Param");
	}
	
	public void sum(double cc,double bb, double dd)  //3 input param
	{
		System.out.println("SUM method ->Three Param");
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum("Maadhav");
	}

public static void main(int p) {
		
		MethodOverloading obj1 = new MethodOverloading();
		obj1.sum();
		//int t = obj1.sum(2);
		//System.out.println(t);
		
	}  //we can overload main method
}
