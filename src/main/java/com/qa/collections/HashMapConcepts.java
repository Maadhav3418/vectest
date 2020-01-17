package com.qa.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcepts {

	
	public static void main(String[] args) {
		/* Hashmap is a class implements  Map interface
		 * Extends Abstract method
		 * It contains only unique values
		 * store the values in Key-value pair combinaion
		 * it may have one or more null key values
		 * it does not maintain any order
		 * */

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2, "Jurasic");
		hm.put(3, "RGV");
		hm.put(4, "VBC");
		hm.put(5, "GlobalUI");
		hm.put(6, "Wisegate");
		hm.put(7, "Order");
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey() + "  " +m.getValue());
		}
		
		System.out.println("Before Remove :" +hm);
		
		hm.remove(4);
		System.out.println("After Remove :" +hm);
	}

}
