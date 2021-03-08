package com.enms;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD,ElementType.TYPE})
@interface CustomAnnotation
{
	int value();
}

class TestAn
{
	
	
	@CustomAnnotation(value = 30)
	public void show()
	{
		System.out.println("annnotation used");
	}
}

public class Exp2 {
	
	public static void main(String[] args) throws Exception
	{
		
		TestAn ta = new TestAn();
		
		Method m = ta.getClass().getMethod("show");
		
		CustomAnnotation can = m.getAnnotation(CustomAnnotation.class);
		
		System.out.println("DATA : "+can.value());
		
	}

}
