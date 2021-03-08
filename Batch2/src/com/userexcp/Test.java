package com.userexcp;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws ValidvoterException,InvalidVoterException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age");
		
		int age = sc.nextInt();
		
		Validater v = new Validater();
		
		v.checkAge(age);
		
		
	}

}
