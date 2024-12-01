@FunctionalInterface
interface Rain{
    void raining();
}
// class M implements Rain{

//     // @Override
//     public void raining() {
//         System.out.println("here it is raining heavily.....");
//     }

// }

public class FunctionalInter {
    
    public static void main(String[] args) {
        
      // Rain obj =  () ->  System.out.println("here it is raining....");
      Rain obj = () ->  System.out.println("Here it is raining....");
  
      Rain a = ()->  System.out.println("ji");
        
      
      obj.raining();
    }
}
