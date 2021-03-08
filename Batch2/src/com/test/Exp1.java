package com.test;

public class Exp1 {
	
	public static void main(String[] args) {
		
		//if - else block
		
		int age = 20;
		double wt = 60.34;
		
		if(age == 18)
		{
			
				
			  System.out.println("just eligible");
			
		}
		else if(age > 18)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
		
		String user = "adm";
		String pass = "admin";
		
		if(user.equals("admin") && pass.equals("admin"))
		{
			System.out.println("login success");
		}
		else
		{
			System.out.println("invalid username and password");
		}
		
	}

}
