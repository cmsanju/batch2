package p1;


interface I1
{
	double pi = 3.14;
	
	void dog();
	
	static void show()
	{
		System.out.println("from inf static method");
	}
	
	default void fox()
	{
		System.out.println("default method from inf");
	}
}

abstract class Abs 
{
	public abstract void movie();
	
	public void human()
	{
		System.out.println("normal method");
	}
}

class Exp7 extends Abs implements I1
{
	@Override
	public void dog()
	{
		System.out.println("overriding inf method");
	}
	
	@Override
	public void movie()
	{
		System.out.println("overriding movie method");
	}
}

public class Exp6 {
	
	public static void main(String[] args) {
		
		Exp7 e = new Exp7();
		
		e.dog();
		e.movie();
		e.human();
		e.fox();
		
		I1.show();
	}

}
