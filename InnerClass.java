class M{

    public void show(){
        System.out.println("In te M show");
    }
    class N{
        public void config(){
            System.out.println("in config of N ");
        }
    }
   static class O{
        public void config2(){
            System.out.println("in config two");
        }
    }
}

class Pq{

    public void add(){
        System.out.println("we are adding....");
    }
    class pqrs{
        public void adding(){
            System.out.println("we are inside the inner class and the classs is non static.....");
        }
    }
    static class pqrst{
        public void summing(){
            System.out.println("we are inside the inner class and the classs is  static.....");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        
        // M obj = new M();
        // obj.show();
        // M.N obj1 = obj.new N();
        // obj1.config();
        // M.O obj2 = new M.O();
        // obj2.config2();
    
        Pq obj = new Pq();
        obj.add();
        Pq.pqrs obj1 = obj.new pqrs();
        obj1.adding();

        Pq.pqrst obj2 = new Pq.pqrst();
        obj2.summing();

    }
}
