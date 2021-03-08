package com.ths;


class A
{
	public void add()
	{
		System.out.println(23+90);
	}
}

class B
{
	public void div()
	{
		System.out.println(456/6);
	}
}

public class RunnTest implements Runnable
{
	public void run()
	{
		try
		{
			A a = new A();
			a.add();
			Thread.sleep(3000);
			B b = new B();
			b.div();
			
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		RunnTest t1 = new RunnTest();
		
		Thread t2 = new Thread(t1);
		
		t2.start();
		
		System.out.println("default thread priority : "+t2.getPriority());//5
	}
}
