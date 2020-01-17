package com.oops.part2;

public class TestCar {

	public static void main(String[] args) {
	
		
		//static polymorphism-- compile time polymorphism
		
		BMW b= new BMW();
		b.start();
		b.stop();
		b.theftSafe();
		b.refuge();
System.out.println(" :*********  :");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuge();
		
		//Top Casting
		Car c1 =new BMW();  //child class object can be referred by parent class reference variable - dynamice polymporphism run time
		c1.start();
		c1.stop();
		c1.refuge();
		//Down casting :
		BMW b1= (BMW) new Car();   //java.lang.ClassCastException:
		
	}

}
