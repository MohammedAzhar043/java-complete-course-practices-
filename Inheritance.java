class cal extends Object{

    public void add(int a ,int b){
        System.out.println(a+b);
    }

    public void sub(int a ,int b){
        System.out.println(a-b);
    }

}
class AdvanCal extends cal{

    public void mul(int a ,int b){
        System.out.println(a*b);
    }

    public void div(int a ,int b){
        System.out.println(a/b);
    }

}
public class Inheritance {
    
    public static void main(String[] args) {
    
        // cal obj = new cal();
        // obj.add(20, 10);
        // obj.sub(10, 5);
        cal obj1 = new AdvanCal();
        obj1.add(10, 20);

    }
}
