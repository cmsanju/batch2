package com.enms;



public class Exp1 {
	
	enum Color
	{
		RED, BLUE,GREEN,SEABLUE,YELLOW,WHITE,SILVER; //etc
	}
	
	public static void main(String[] args) {
		
		Color c =  Color.BLUE;
		
		System.out.println(c);
		
		for(Color c1 : Color.values())
		{
			System.out.println(c1);
		}
		
	}
	
}
