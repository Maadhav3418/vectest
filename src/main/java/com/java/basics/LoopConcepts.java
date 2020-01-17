package com.java.basics;

public class LoopConcepts {

	public static void main(String[] args) {
	
		
		//1.while loop 
		//dis-advantage: it will generate infinite loop if you dont give increment/decrement part
		int i=1; //initialization
				
		while (i<10) // condition
		{
			System.out.println(i);
			i=i+1;   //increment/decrement
		}
		System.out.println("******************");
		//j ++ means  j= j+1;
		
		//2. for loop
		for(int j=1;j<=10;j++) // initialization,conditional,Incremental
		{
			System.out.println(j);
		}
		System.out.println("******Reserver************");
		for (int k=10;k>=1;k--)  //decrement and reserver
		{
			
			System.out.println(k);
		}
			
	}

}
