package p1;


class A
{
	public void show()
	{
		System.out.println("i am from show()");
	}
}
class B extends A
{
	public void cat()
	{
		System.out.println("cat()");
	}
}

class C extends A
{
	public void movie()
	{
		System.out.println("movie()");
	}
}

public class Exp5 {
	
	public static void main(String[] args) {
		
		C c = new C();
		
		//c.cat();
		c.show();
		c.movie();
		
		B b = new B();
		b.show();
		b.cat();
	}

}
