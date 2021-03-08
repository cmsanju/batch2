package com.ths;

public class Exp3 extends Thread
{
	public void run()
	{
		System.out.println("i am from run()");
	}
	
	public static void main(String[] args) {
		
		System.out.println(MAX_PRIORITY);//10
		System.out.println(NORM_PRIORITY);//5
		System.out.println(MIN_PRIORITY);//1
		
		Exp3 t1 = new Exp3();
		Exp3 t2 = new Exp3();
		Exp3 t3 = new Exp3();
		
		System.out.println("default priority : "+t1.getPriority());
		System.out.println("default name of the thread1 : "+t1.getName());
		System.out.println("default name of the thread2 : "+t2.getName());
		System.out.println("default name of the thread3 : "+t3.getName());
		
		t1.setName("Transfer");
		t2.setName("withdraw");
		t3.setName("acc open");
		
		System.out.println("after setting name of the thread1 : "+t1.getName());
		System.out.println("after setting name of the thread2 : "+t2.getName());
		System.out.println("after setting name of the thread3 : "+t3.getName());
		
	}
}
