package com.java8;

import java.util.Optional;

public class Exp7 {
	
	public static void main(String[] args) {
		
		String[] str = new String[10];
		
		str[5] = "ABHI IS from batch2";
		
		Optional<String> ifNull = Optional.ofNullable(str[5]);
		
		if(ifNull.isPresent())
		{
			String lstr = str[5].toLowerCase();
			
			System.out.println(lstr);
		}
		else
		{
			System.out.println("no value is there");
		}
		
	}

}
