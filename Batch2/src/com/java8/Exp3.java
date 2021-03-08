package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Exp3 {
	
	public static void main(String[] args) {
		
		List<Product> plist = new ArrayList<Product>();
		
		for(int i = 0; i < 100; i++)
		{
			plist.add(new Product(1, "apple", 1234.34));
			
			Product p = new Product(2,"lenovo", 5673.78);
			
			plist.add(p);
			
			plist.add(new Product(3,"sony",46464.64));
			
			plist.add(new Product(4, "asus",6644.89));
			
			plist.add(new Product(5, "dell", 45446.88));
		}
		
		//parallel stream vs sequential 
		 
		 long t1, t2;
		 //sequential 
		 t1 = System.currentTimeMillis();
		 System.out.println("Sequential Stream : "+plist.stream().filter(fl -> fl.price > 15000).count());
		 
		 t2 = System.currentTimeMillis();
		 //System.out.println("Sequential Stream : "+plist.stream().filter(fl -> fl.price > 15000).count());
		 System.out.println("sequential Total time : "+(t2-t1));
		
		 //parallel
		 t1 = System.currentTimeMillis();
		 System.out.println("Parallel Stream : "+ plist.parallelStream().filter(fl -> fl.price > 15000).count());
		 
		 t2 = System.currentTimeMillis();
		 //System.out.println("Parallel Stream : "+ plist.parallelStream().filter(fl -> fl.price > 15000).count());
		 System.out.println("parallel Total Time : "+(t2-t1));
		
	}

}
