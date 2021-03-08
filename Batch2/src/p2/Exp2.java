package p2;

class A
{
	public void cal()
	{
		System.out.println(123+37);
	}
}

class B extends A
{
	public void cal()
	{
		System.out.println(23-21);
	}
}

class C extends A
{
	public void cal()
	{
		System.out.println(23/2);
	}
}


public class Exp2 {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.cal();
		C c = new C();
		c.cal();
		
		
		A a = new B();// dynamic binding
		a.cal();//
		A a1 = new  C();
		
		a1.cal();
	}

}
