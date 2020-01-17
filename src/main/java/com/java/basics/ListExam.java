package com.java.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class ListExam {
	
	public static void main(String[] args) {
		
		
//		ArrayList<String> str = new ArrayList<String>();
//		str.add("Selenium");
//		str.add("Selenium1234");
//		
//		int size = str.size();
//		
//		ListIterator<String> itr = str.listIterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		for(String st:str)
//		{
//			System.out.println(st);
//		}
//		
//		for (int i = 0; i <size; i++) {
//			
//			System.out.println(str.get(i));
//			
//		}
		
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay"); 
		
		TreeSet<String> set1=( TreeSet<String>)set.descendingSet(); 
		//System.out.println(set);
		//Traversing elements  
		Iterator<String> itr=set1.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
