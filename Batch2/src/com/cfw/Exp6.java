package com.cfw;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Exp6 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("apple", 3000);
		tm.put("dell", 2000);
		tm.put("sony", 2600);
		tm.put("lenovo", 1000);
		tm.put("asus", 1200);
		tm.put("iball", 2300);
		
		System.out.println(tm);
		
		
		Iterator<Entry<String, Integer>> itr = tm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println("Product : "+et.getKey()+" Price : "+et.getValue());
		}
 	}

}
