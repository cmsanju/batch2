package p2;

@FunctionalInterface
interface Func
{
	void details(int x);
}

public class Exp6 {
	
	public static void main(String[] args) throws Exception
	{
		
		Func f = new Func()
				{
					@Override
					public void details(int x)
					{
						System.out.println("functional interface");
					}
				};f.details(10);
				
		Func ff = (int x) -> System.out.println("overriding");
		
		ff.details(10);
		
		
		
		System.out.println(f.hashCode());
		System.out.println(ff.hashCode());
		
		f=null;
		ff=null;
		
		System.gc();
		System.out.println("gc executed");
		
	}
		
	@Override
	protected void finalize()
	{
		System.out.println("finalize() executed");
	}

}
