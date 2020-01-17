package com.java.basics;

public class Preparation {
	
	
		   public Preparation(){}
		   public static Preparation getInstance(){
			   Preparation tester = new Preparation();
			   System.out.println("The Return values is :" +tester);
		       return tester;
		       
		   }
		
	
public static void main(String args[])
{
	Preparation pr= new Preparation();
	pr.getInstance();
}
}  

/*public class Preparation{
	
	   static{
	   System.out.println("Hello Youth4Work");
	   System.exit(0);
	   }
} */