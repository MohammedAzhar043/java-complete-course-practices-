abstract class car1{

    public abstract void opendoor();
    public abstract void closedoor();
    public void drive(){
        System.out.println("Driving");
    }
    public void playmusic(){
        System.out.println("playing the music...");
    }
}
class swift extends car1{

    public void opendoor(){
        System.out.println("opering the door of the car");
    }
    public void closedoor(){
        System.out.println("closing the door of the car....");
    }
}
public class Abstract {
    public static void main(String[] args) {

        car1 c = new swift();
        c.drive();
        c.playmusic();
        

    }
}
