package p2;

public class Exp7 {
	
	
	@Override
	protected void finalize()
	{
		System.out.println("finalize() executed");
	}
	
	public static void main(String[] args) {
		
		Exp7 e = new Exp7();
		
		System.out.println(e.hashCode());
		
		e = null;
		
		System.gc();
		
		System.out.println("gc collected object");
		
	}

}
