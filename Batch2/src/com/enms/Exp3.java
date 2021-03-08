package com.enms;

public class Exp3 {
	
	@Override
	public void finalize()
	{
		System.out.println("object collected by gc()");
	}
	
	public static void main(String[] args) {
		
		Exp3 e1 = new Exp3();
		Exp3 e2 = new Exp3();
		
		e1 = null;
		e2 = null;
		
		System.gc();
	}
}
