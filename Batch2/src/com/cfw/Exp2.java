package com.cfw;

import java.util.Stack;

public class Exp2 {
	
	public static void main(String[] args) {
		
		Stack list = new Stack();
		
		list.add("java");
		list.add("abhi");
		list.add('C');
		list.add(10);
		list.add(23.33f);
		list.add(39.89);
		list.add(false);
		list.add("java");
		list.add(10);
		
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list.firstElement());
		System.out.println(list.lastElement());
		
		System.out.println(list.pop());
		System.out.println(list);
		list.push("praveen");
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.search(10));
		System.out.println(list.search(100));
		System.out.println(list.empty());
	}

}
