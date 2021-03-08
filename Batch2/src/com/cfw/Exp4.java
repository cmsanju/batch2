package com.cfw;

import java.util.Set;
import java.util.TreeSet;

public class Exp4 {
	
	public static void main(String[] args) {
		
		Set<String> obj = new TreeSet<String>();
		
		//obj.add(200);
		obj.add("abhi");
		//obj.add(23.23);
		obj.add("praveen");
		obj.add("naveen");
		//obj.add(34.4f);
		//obj.add(100);
		obj.add("abhi");
		obj.add("priyanka");
		//obj.add(80);
		obj.add("shriram");
		obj.add("Sanjay");
		obj.add("Zero");
		
		System.out.println(obj);
		
		Set<Integer> ts = new TreeSet<Integer>();
		
		ts.add(29);
		ts.add(34);
		ts.add(1);
		ts.add(22);
		ts.add(2);
		ts.add(7);
		ts.add(31);
		ts.add(5);
		
		System.out.println(ts);
		
		
	}

}
