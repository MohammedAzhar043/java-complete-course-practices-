abstract class U{
    public abstract void add();
    public abstract void sub();
}
public class AbstractAnanimous {
    
    public static void main(String[] args) {
        U obj = new U() {
            public void add(){
                System.out.println("we are adding");
            }
            public void sub(){
                System.out.println("we are substracting");
            }
        };
        obj.add();
        obj.sub();
     

    }
}
