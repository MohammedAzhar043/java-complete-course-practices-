class P{
    public void play(){
        System.out.println("Playing.... in p");
    }
}
class Q extends P{

    public void play(){
        System.out.println("Playing....in q");
    }
}
public class Ananimous {
    
    public static void main(String[] args) {
        
        // P a = new P();
        // a.play();

        P a = new P(){
            public void play(){
                System.out.println("in ananimous class...");
            }
        };
        a.play();
    }
}
