// class Dummy1{
//     public void show()
//     {
//         System.out.println("in dummy one");
//     }
// }

// class Dummy2 extends Dummy1{
//     public void show()
//     {
//         System.out.println("in dummy two");
//     }
// }

class A3
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B3 extends A3
{
	public void show2()
	{
		System.out.println("in show B");
	}
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        
        // Dummy1 d = new Dummy2();
        // d.show();
        // Dummy1 d1 = (Dummy1)d;
        // d1.show();

        // A3 obj= new A3();
   	// A3 obj=(A3) new B3();   //upcasting
   	// obj.show1();
    	
    	A3 obj=new B3();
    	obj.show1();
    	
    	B3 obj1=(B3)obj;
    	obj1.show2();
    }
}
