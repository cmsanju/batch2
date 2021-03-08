package p2;

interface I1
{
	void add();
	
	interface I2
	{
		void sub();
	}
}

class I1Impl implements I1.I2
{
	public void sub()
	{
		System.out.println("overriding");
	}
	
	public void add()
	{
		System.out.println("overriding");
	}
}

public class Exp5 {
	
	public static void main(String[] args) {
		I1Impl i = new I1Impl();
		
		i.sub();
	}

}
