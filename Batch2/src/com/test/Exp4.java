package com.test;

public class Exp4 {
	
	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "abhishek";
		String s3 = "praveen";
		String s4 = "java";
		
		String s5 = new String("java");
		String s6 = new String("abhishek");
		
		System.out.println(s1 == s5);
		
		System.out.println(s2 == s6);
		
		System.out.println(s1.equals(s5));
		System.out.println(s2.equals(s6));
		
		String s7 = s1.concat(s6);
		
		System.out.println(s7);
		
		System.out.println(s7 == s1);
		System.out.println(s7.equals(s6));
		
		System.out.println(s1.charAt(4));
		
	}

}
