package com.cfw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exp5 {
	
	public static void main(String[] args) {
		
		//HashMap hm = new HashMap();
		LinkedHashMap hm = new LinkedHashMap();
		
		hm.put(10, "abhi");
		hm.put("name", 234);
		hm.put("price", 200);
		hm.put(10,"sanjay");
		hm.put(45, "rollNo");
		hm.put("per", 23.78);
		hm.put("price",5000);
		hm.put(101,"sanjay");
		
		System.out.println(hm);
		
		Iterator<Map.Entry> itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry et = itr.next();
			
			System.out.println("Key : "+et.getKey()+" Value : "+et.getValue());
		}
	}

}
