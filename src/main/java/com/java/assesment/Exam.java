package com.java.assesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Exam {

	public void hashDelete()	{
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
        hm.put(1, "Test"); 
        hm.put(2, "Selenium"); 
        hm.put(3, "Edit"); 
        hm.put(4, "Maveric"); 
        hm.put(5, "Source");
        System.out.println("Before Deleting the values : " +hm);
        hm.remove(3, "Edit");
        System.out.println("After Deleting the Single value from the List : " +hm);
        hm.clear();
        System.out.println("After Clearing the values : " +hm);
	}
	
	public void palindrome()
	{
		String reverse = "";
		String src = "MADAM";
		//String src = "ABCDCBA";
		Scanner sc = new Scanner(src);
		src=sc.nextLine();
		int size = src.length();
		System.out.println("The String Length is :" + size);
		for	(int i =size-1;i>=0; i--)
		{
			reverse= reverse+src.charAt(i);
			System.out.println("Reverse : "+reverse);
		}
		if (src.equals(reverse))
	         System.out.println(src+" is a palindrome");
	      else
	         System.out.println(src+" is not a palindrome");
		
	}

	public void Series() {
		
		for(int i=1; i<=10; i++)
	     {
	      	      System.out.println(i +" ");
	     }
	}
	
	public void duplicateString()
	{
		  String src = "Welcome to Maveric";
		  int cnt = 0;
		  String s=src.replace(" ", "");
		  char[] inp = src.toCharArray();
		   for (int i = 0; i < s.length(); i++) {
		   for (int j = i + 1; j < s.length(); j++) {
		    if (inp[i] == inp[j]) 
		    {
		     cnt++;
		     System.out.println("Duplicate Letter is:" + inp[j]);
		     
	        }
		  
		   }
		 	   
		  }
		   System.out.println("" +cnt);  
	}
	
public void AddElements()
{
	HashSet<String> set=new HashSet();  
    set.add("Ram");    
    set.add("Raja");    
    set.add("Gopi");   
    set.add("Hari");  
    set.add("Maadhav");  
    Iterator<String> i=set.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(i.next());  
    }  
}
	public static void main(String[] args) {
		Exam ex = new Exam();
		//ex.hashDelete();
		//ex.palindrome();
		//ex.Series();
		//ex.duplicateString();
		//ex.program();
		ex.AddElements();
	}

}