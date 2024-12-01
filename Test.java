class AA{

   public void show() throws ClassNotFoundException{
    
        Class.forName("Test");
    
   }
}


public class Test {

    static{
        System.out.println("class loader....");
    }
    public static void main(String[] args) {
        AA obj = new AA();

        try{
            obj.show();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
