package com.java8;

import java.util.Scanner;

public class Exp10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a product id");
		
		String id = sc.nextLine();
		
		int pid = Integer.parseInt(id);
		
		System.out.println("Product name");
		
		String name = sc.nextLine();
		
		System.out.println(" "+name);
	}
}
