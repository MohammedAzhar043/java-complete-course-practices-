class A{
    public A(){
        super();
        System.out.println("in default constructor of A");
    }
    public A(int a){
        // super();
        // this();
        System.out.println("in a int");
    }
}
class B extends A {

    public B(){
        // super();
        // super(5);
        // this(5);
        System.out.println("in default constructor of B");
    }
    public B(int b){
        // super();
        // super(b);
        // this();
        System.out.println("in b int"+ b);
    }
}

public class ThisAndSuperMethod {
    public static void main(String[] args) {
        
        // B obj = new B(5);
        // A obj1 = new A(5);

    }
}
