package com.oops.part2;

public class BMW extends Car  //has -a relationship

// when method is present in parent class as well as child class with the same name and same number of arguments,
// is called Method -overriding.
{
public void start() //Overridden method
{
	System.out.println("BMW---Start-Overridden method");
}
public void theftSafe()
{
	System.out.println("BMW--theftSafe");
}
}
