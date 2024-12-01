 class Calc1
{
	public final void show()
	{
		System.out.println("By Navin");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc1 extends Calc1
{
	// public void show()
	// {
	// 	System.out.println("By John");
	
}

public class FinalKeyword {
    public static void main(String[] args) {
        
        final int a =10;
        // a = 20;
        // System.out.println(a);
        Calc1 cl = new Calc1();
        cl.add(20, 30);
        cl.show();
        
    }
}

