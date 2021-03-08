package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
	
	int id;
	String name;
	double price;
	
	public Product()
	{
		
	}

	public Product(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Exp2 {
	
	public static void main(String[] args) {
		
		List<Product> plist = new ArrayList<Product>();
		
		plist.add(new Product(1, "apple", 1234.34));
		
		Product p = new Product(2,"lenovo", 5673.78);
		
		plist.add(p);
		
		plist.add(new Product(3,"sony",46464.64));
		
		plist.add(new Product(4, "asus",6644.89));
		
		plist.add(new Product(5, "dell", 45446.88));
		
		
		for(Product pl : plist)
		{
			if(pl.price > 15000)
			{
			System.out.println(pl.id+" "+pl.name+" "+pl.price);
			}
		}
		
		//convert list of data into streams easy
		
		 plist.stream().
		 filter(fl -> fl.price > 15000).
		 forEach(fl-> System.out.println(fl.id+" "+fl.name+" "+fl.price));
		 
		 //toMap
		 
		 Map<Integer, String> lm = plist.stream().
				 filter(pl -> pl.price > 1400).
				 collect(Collectors.toMap(pl -> pl.id, pl -> pl.name));
		 
		 System.out.println(lm);
			 
	}
}
