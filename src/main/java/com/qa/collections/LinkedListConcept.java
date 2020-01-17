package com.qa.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	
	public static void main(String[] args) {
	
		LinkedList<String> ll= new LinkedList<String>();
		//add
		ll.add("G.T Express");
		ll.add("Tamilnaidu");
		ll.add("Charminar");
		ll.add("Hyd Express");
		ll.add("Howrah");
		System.out.println("Content of Linked list" + ll);
		ll.addFirst("Express Trains from Chennai:");
		ll.addLast("StopEnd");
		System.out.println("Content of Linked list after" + ll);
		//get
		System.out.println(ll.get(3));
		//set
		ll.set(0,"Maadhav");
		System.out.println(ll.get(0));
		
		//remove last and fist
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of Linked list" + ll);
		ll.remove(2);
		System.out.println("Content of Linked list" + ll);
		
		// how to print all the values of the lined list :
		//1.For loop
		System.out.println("Using For Loop:");
		for(int n=0;n<ll.size();n++)
		{
			System.out.println("The Values of the Linked List :" + ll.get(n));
		}
		//2.Advance for loop
		System.out.println("Advance For Loop:");
		for(String str:ll)
		{
			System.out.println("The Values of Advance list is :" + str);
		}
		//3.Iterator
		System.out.println("Iterator For Loop:");
		Iterator<String> it =ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//4.while loop
		System.out.println(" WhileLoop:");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
	}

}
