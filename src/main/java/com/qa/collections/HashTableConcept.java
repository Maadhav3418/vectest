package com.qa.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	// HashTable is similar to Hashmap,but it is synchronised
	//stores the values on the basis of key- val
	//key ->Object-HashCode->Value
	//it contains only unique vaues
	//no null key and null values- we will get null pointer exceptions
	
	Hashtable h1= new Hashtable();
	Hashtable h2= new Hashtable();
	Hashtable h3= new Hashtable();
	Hashtable h4= new Hashtable();
	
	//contains()
	public void containsMethod()
	{
		Hashtable h1= new Hashtable();
		h1.put(1,"Chethan");
		h1.put(2,"Yuval");
		h1.put(3,"Neehal");
		h1.put(4,"Mahesh");
		h1.put(4, "Chethan");
		System.out.println("Values from h1 :" + h1);
		if(h1.contains("Chethan"))
		{
			System.out.println("Values found:" + h1);
	} else
	{
		System.out.println("Values not contain:" + h1);
	}
}
		//clone() &&  clear()
	public void cloneMethod()
	{
		System.out.println("Values from h1 Before Clone :" + h1);
		Hashtable h2 = new Hashtable();
        h2=(Hashtable)h1.clone();
		System.out.println("Values from h2 after Clone :" + h2);
		h1.clear();
		System.out.println("Values from h1 after clear :" + h1);
		System.out.println("Values from h2 after clear :" + h2);
	}
	
	public void enumerationTest()   //print all the values from hashtable using -enumeration - elements()
	{
		h1.put(1,"Chethan");
		h1.put(2,"Yuval");
		h1.put(3,"Neehal");
		h1.put(4,"Mahesh");
		h1.put(4, "Chethan");
		Enumeration e = h1.elements();
		System.out.println("Values from h1 contains :" + h1);
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		}
	}
	
	public void entrySetTest() //get all the values from hashtable using - entrySet() - ->set of hashtable values
	{
		
		h1.put(1,"Chethan");
		h1.put(2,"Yuval");
		h1.put(3,"Neehal");
		h1.put(4,"Mahesh");
		h1.put(4, "Chethan");
		System.out.println("Values from h1 EntrySet :" + h1);
	Set s =h1.entrySet();
	System.out.println("Values from Set  :" + s);
	}
	
	public void equalValues()
	{

		Hashtable h3 = new Hashtable();
        h3=(Hashtable)h1.clone();
		h3.put(1,"Janu");
		h3.put(2,"Hema");
		h3.put(3,"Hasittha");  
		// check the both tables are equal or not
		if(h1.equals(h3)) {
			
		
			System.out.println("Both are equal" + h3);
			}
		else {
			System.out.println("Both are Not equal" + h3);
		}
		
		// get the value  from ket
		System.out.println(h3.get(1));
		
		//get the hashcode of hashtable object
		
		System.out.println("The hashcode value of String :" +h3.hashCode());
	
	
	}
	
	public void genericTest()  //Generic 
	{
		
		Hashtable<String,String> st4= new Hashtable<String,String>();
		h4.put(1,"Janu");
		h4.put(2,"Hema");
		System.out.println("The genericcode value of String :" +h4);
	}
	
	
	public static void main(String[] args) {

		
		HashTableConcept htc = new HashTableConcept();
		htc.containsMethod();
		htc.cloneMethod();
		htc.enumerationTest();
		htc.entrySetTest();
		htc.equalValues();
		htc.genericTest();
		
	}
	
	

}
