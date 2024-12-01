@Deprecated
class Override2{
    
    public void usingthismethodforoverride(){
        System.out.println("iam using the Annotation");
    }
}
class Override1 extends Override2{
    // @Override
    public void usingthismethodsforoverride(){
        System.out.println("iam in the overrided methods....");
    }
    @Override
    public void usingthismethodforoverride(){
        System.out.println("iam in the overrided methods....");
    }

}
public class Annotation {
    public static void main(String[] args) {
     
        Override2 o = new Override2();
        o.usingthismethodforoverride();
    }
}
