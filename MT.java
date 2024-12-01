class MNO extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("HI.....");
            try{
                Thread.sleep(20);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class PQR extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {

            System.out.println("Hello.....");
            try{
                Thread.sleep(20);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class MT {
    public static void main(String[] args) {

        MNO obj = new MNO();
        PQR obj1 = new PQR();

        obj.start();
        try {
            Thread.sleep(2);
        } catch (Exception e) {
            System.out.println(e);
        }
        obj1.start();

    }
}
