package com.test;

public class Exp6 {
	
	
	
	//type 1 method taking the parameters and returning the values
	
	public int human(int x, int y)
	{
		System.out.println("type 1 method");
		
		return x;
	}
	
	//type 2 method not taking the parameters and not returning
	
	public void fox()
	{
		System.out.println("type 2");
	}
	
	//type 3 method taking the parameters but not returning
	
	public void dog(String name)
	{
		System.out.println("type 3");
	}
	
	//type 4 method not taking the parameters but returning the values
	
	public String cat()
	{
		System.out.println("type 4");
		
		return "java";
	}
	
	
	public static void main(String[] args) {
		
		Exp6 e = new Exp6();
		
		e.human(20, 40);
		
		e.fox();
		
		e.dog("jungle");
		
		e.cat();
		
		//cat();
		
	}

}
