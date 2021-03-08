package com.cfw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exp1 {
	
	public static void main(String[] args) {
		
		//Collection list = new ArrayList();
		//List list = new ArrayList();
		//ArrayList list = new ArrayList();
		
		LinkedList list = new LinkedList();
		
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
		
		int x = 10;
		
		System.out.println(x);
		
		System.out.println(list.size());
		
		System.out.println(list.get(2));
		
		//Iterator (hasNext(), next() and remove()) // 
		//ListIterator(hasPrevious(), previous())  // list objects only 
		//Enumeration // it will work onlu only on old cfw
		
		//Iterator itr = list.iterator();
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("*************");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
