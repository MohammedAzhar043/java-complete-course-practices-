class A{
    public void add(int a,int b){
        System.out.println( a+b);
    }
}
class B extends A{
    public void add(int a,int b){
        System.out.println( a+b+1);
    }

    @Override
    public String toString() {
        return "B []";
    }
}

public class MethodOverriding {
    
    public static void main(String[] args) {
    
        A obj = new A();
        obj.add(1, 2);
    }

}
