package com.qa.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	
	public static <E> void main(String[] args) {
	int a[] = new int[13]; //static array - size fixed
	//dynamic array-array list
	//1.can contain duplicate values/elements
	//2.maintain insertation order
	//3.Synchronized
	//4.allows random access to fetch the element because it stores the values on the basis of indexs
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50); al.add(50);
	System.out.println("Size of the Array List :" + al.size());
	System.out.println("Get The value from the Index" + al.get(4));
	//to print all the values form the list
	//1. from loop
	//2.using iterator
	for ( int i=0;i<al.size();i++)
	{
		System.out.println("Size of the Array List :" + al.get(i));
	}
	//Non Generic Vs Generic :
	//Generic classes introduced in JDK 1.0
	//in Generic we can define premitative,non premitative data types

	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al1.add(70);
	
	ArrayList<String> al2 = new ArrayList<String>();
	al2.add("Chethan");
	
	ArrayList<E> ar3= new ArrayList<E>(); //will be used if we dont now about the available declaration
	
	//Employee class objects
	Employee e1 =new  Employee("Maadhav",27,"Qa");
	Employee e2 =new  Employee("Rao",26,"Qa");
	Employee e3 =new  Employee("Raju",28,"Qa");
	Employee e4 =new  Employee("Hari Ravi",90,"Ma");
	
	//create array list
	ArrayList<Employee> ar4= new ArrayList <Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	ar4.add(e4);
	
	// iterator
	
	 Iterator<Employee>it =ar4.iterator();
	
	while(it.hasNext()) {
		Employee em= it.next();
		System.out.println("The Name is : " + em.name);
		System.out.println("The Age is : " + em.age);
		System.out.println("The Department is : " + em.dept);
	}
	
	System.out.println(" Two merge Two coloumns () &&&&&&&&&& Add ALL TEST &&&&&&&");
	//addAll()
	
	ArrayList<String> ar5 = new ArrayList<String>();
	ar5.add("test");
	ar5.add("Name");
	ar5.add("ENG");
	ar5.add("Home");
	
	ArrayList<String> ar6=new ArrayList<String>();
	
	ar6.add("Superman");
	ar6.add("Spiderman");
	ar6.add("He-man");
	
	ar5.addAll(ar6);
	for(int i=0;i< ar5.size();i++)
	{
		System.out.println("All values:" + ar5.get(i));
	}
	
	System.out.println(" Remove all &&&&&&&&&& TEST &&&&&&&");
	
	ar5.remove(ar6);
	
	for (int i=0; i<=ar5.size();i++)
	{
		System.out.println("Remove All Values : " + ar5.get(i));
	}
	
	//RetainAll()
	
	System.out.println(" COMMON &&&&&&&&&& TEST &&&&&&&");
	
	ArrayList<String> ar7= new ArrayList<String>();
	ar7.add("TDP");
	ar7.add("TSRCP");
	ar7.add("Jenasena");
	
	ArrayList<String> ar8= new ArrayList<String>();
	ar8.add("Brother");
	ar8.add("TDP");
	
	ar7.retainAll(ar8);
	for(int i=0;i<=ar7.size();i++)
	{
		System.out.println("Retain All Values : " + ar7.get(i));
	}
	
	}

}
