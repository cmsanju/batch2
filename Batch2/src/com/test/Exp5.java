package com.test;

public class Exp5 {
	
	
	public static void main(String[] args) {
		

		int[] ar = {10,20,30,40};
		
		System.out.println(ar[0]+ar[1]);
		
		
		
		for(int x : ar)
		{
			System.out.println(x);
		}
		
		String[] names = {"abhishek", "praveen", "priyanka","shanthan", "sanjay"};
		
		System.out.println(names.length);
		
		System.out.println(names[0]);
		
		
		for(int i = names.length-1; i >= 0; i--)
		{
			System.out.println(names[i]);
		}
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
	}

}
