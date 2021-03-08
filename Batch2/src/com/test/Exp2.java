package com.test;

import java.util.Scanner;

public class Exp2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pls select lang 1 for Hindi 2 for English n 3 for Arabic");
		
		int lang = sc.nextInt();
		
		double d = sc.nextDouble();
		
		
		switch(lang)
		{
		case 1: System.out.println("selected Hindi");
		break;
		case 2: System.out.println("selected English");
		break;
		case 3: System.out.println("selected Arabic");
		}
	}

}
