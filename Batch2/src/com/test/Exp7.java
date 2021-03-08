package com.test;

public class Exp7 {
	
	static int pinCode = 123123;
	
	       int atmPin = 1111;
	       
	  static void cityDetails()
	  {
		  System.out.println("City pincode : "+pinCode);
		 
		  Exp7 e = new Exp7();
		  
		  System.out.println(e.atmPin);
	  }
	  
	  void userDetails()
	  {
		  System.out.println("aTM PIN : "+atmPin);
		  
		  System.out.println("City pincode : "+Exp7.pinCode);
	  }
	  
	  public static void main(String[] args) {
		
		  cityDetails();
		  
		  Exp7 e = new Exp7();
		  
		  e.userDetails();
	}

}
