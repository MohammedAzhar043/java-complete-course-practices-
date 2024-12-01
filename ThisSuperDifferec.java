class C extends Object
{
	int num= 1;
}

class D extends C
{
	int num=2;
	public int getValue()
	{
		int num=3;
        return num;
		// return this.num;
		// return super.num;
	}
}
public class ThisSuperDifferec {
    public static void main(String[] args) {
        

        D obj=new D();
//		System.out.println(obj.num);
		System.out.println(obj.getValue());
        System.out.println(new D().getClass());
        System.out.println(new D().getValue());
    }
}
