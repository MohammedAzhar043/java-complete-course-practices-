class ABC extends Thread {
    public void run() {

        for (int i = 0; i <= 50; i++) {

            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BCA extends Thread {
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultipleThreads {

    public static void main(String[] args) {

        ABC obj = new ABC();
        BCA obj1 = new BCA();
        // obj.start();
        // obj1.start();

        // obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        // System.out.println(obj.getPriority());

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj1.start();

    }
}
