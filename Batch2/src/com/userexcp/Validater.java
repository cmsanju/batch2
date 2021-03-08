package com.userexcp;

public class Validater {
		
	public void checkAge(int age)throws ValidvoterException, InvalidVoterException
	{
		if(age >= 18)
		{
			ValidvoterException ve = new ValidvoterException("Eligible");
			throw(ve);
		}
		else
		{
			InvalidVoterException ie = new InvalidVoterException("not eligible");
			
			throw(ie);
		}
	}
}
