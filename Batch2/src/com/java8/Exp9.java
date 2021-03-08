package com.java8;

import java.util.concurrent.CompletableFuture;

public class Exp9 {
	
	public static void main(String[] args) throws Exception
	{
		
		CompletableFuture<Void> cf = CompletableFuture.runAsync(new Runnable() {
			
			@Override
			public void run()
			{
				System.out.println("run separate Asynchronus operations using threads");
			}
		});
		
		cf.get();
	}

}
