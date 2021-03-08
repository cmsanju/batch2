package com.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Exp8 {
	
	public static void main(String[] args) throws Exception
	{
		
		Runnable rn = new Runnable()
				{
					public void run()
					{
						System.out.println("run()");
					}
				};
				rn.run();
				
	  Runnable rrn = () -> {
		  
		  System.out.println("run()");
	  };
	  
	  rrn.run();
	  
	  CompletableFuture<Void> cf = CompletableFuture.runAsync(new Runnable() {
			
			@Override
			public void run()
			{
				try
				{
					TimeUnit.SECONDS.sleep(1);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("this is async data exec");
			}
		});
	  
	  cf.get();
	  
	}
}
