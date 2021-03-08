package p2;

import p1.Exp1;

public class Exp3 {
	
	Exp1 e = new Exp1();
	
	public void disp()
	{
		//System.out.println(e.a);
		//System.out.println(e.b);
		//System.out.println(e.c);
		System.out.println(e.d);
	}

}

class Exp4 extends Exp1
{
	public void disp()
	{
		//System.out.println(a);//private
		//System.out.println(b);//default
		System.out.println(c);//protected
		System.out.println(d);//public
	}
}
