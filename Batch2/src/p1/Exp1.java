package p1;

public class Exp1 {
	
	private int a = 20;
	        int b = 30;
	        
    protected int c = 40;
    
    public int d = 50;
    
    public void disp()
    {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	System.out.println(d);
    }

}
class Exp2 extends Exp1
{
	public void disp()
	{
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}