package com.excp;

public class Exp1 {
	
	public static void main(String[] args) {
		
		try {
		
			System.out.println(122/3);
		
			int[] ar = {10,40,69,23};
		
			System.out.println(ar[7]);
			
			String name = "abhi";
			
			System.out.println(name.charAt(2));
			
		}catch(ArithmeticException ae)
		{
			System.out.println("can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check array size");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("i am finally");
		}
	}

}
/*
*
*Exception handling techniques
*1 try
*2 catch
*3 finally
*4 throws
*5 throw
*/