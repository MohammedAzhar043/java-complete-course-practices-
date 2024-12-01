 class cal {

    public void add(int a,int b)    
    {
        // return a+b;
        System.out.println(a+b);
    }

    public int sub(int a,int b)    
    {
        return a-b;
    }
}
class AdvanceCal extends cal{
    public int mul(int a,int b)    
    {
        return a*b;
    }

    public int div(int a,int b)    
    {
        return a/b;
    }
}

class VeryAdvanceCal extends AdvanceCal{
    public int power(int a,int b)    
    {
        return power(a, b);
    }

   
}



public class SingleMultiLevelInheritance {
    
    public static void main(String[] args) {
        
        cal obj = new cal();
        // System.out.println(obj.add(1, 8));
        obj.add(1, 2);

    }
}
