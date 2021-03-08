package com.cfw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exp3 {
	
	public static void main(String[] args) {
		
		//Set obj = new HashSet();
		Set obj = new LinkedHashSet();
		
		obj.add("abhi");
		obj.add(80);
		obj.add(23.23);
		obj.add("praveen");
		obj.add("naveen");
		obj.add(34.4f);
		obj.add(100);
		obj.add("abhi");
		obj.add("priyanka");
		obj.add(80);
		
		System.out.println(obj);
		
		Iterator itr = obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
