package com.java8;

@FunctionalInterface
interface FunTest
{
	void dog(String name);
}

public class Exp1 {
	
	public static void main(String[] args) {
		
		FunTest ft = (String name) ->
		{
			System.out.println("implementing funInf : "+name);
			
		};
		
		
		
		ft.dog("rock");
	}
}
