
class Computer{

    public void playmusic(){
        System.out.println("playing the music....");
    }

    public String getMeApen(int cost){


        if(cost>=10){
            return "got the pen";
        }
        else{
            return "no pen will get in the given amount";
        }
    }

}

public class Demo1 {
    
    public static void main(Strings[] args) {
        
        Computer cmp = new Computer();

        cmp.playmusic();

        String pen = cmp.getMeApen(20);
        System.out.println(pen);
    }
}
