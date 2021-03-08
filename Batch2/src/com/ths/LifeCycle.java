package com.ths;

public class LifeCycle  extends Thread
{
	@Override
	public void run()
	{
		try
		{
			
		  System.out.println("i am from run()");
		  
		  Thread.sleep(20000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		
		LifeCycle t1 = new LifeCycle();
		
		System.out.println("before starting thread state : "+t1.getState());
		System.out.println("before starting thread status : "+t1.isAlive());
		
		t1.start();
		
		System.out.println("after starting thread state : "+t1.getState());
		System.out.println("after starting thread status : "+t1.isAlive());
		Thread.sleep(1000);
		System.out.println("in sleep thread state : "+t1.getState());
		System.out.println("in sleep thread status : "+t1.isAlive());
		
		t1.join();
		
		System.out.println("after joining thread state : "+t1.getState());
		System.out.println("after joing thread status : "+t1.isAlive());
	}

}
