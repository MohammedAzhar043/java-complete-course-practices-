class K implements Runnable {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

class Q implements Runnable {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

public class RunnableVsThrowable {
    public static void main(String[] args) {
        // K obj = new K();
        // Thread t = new Thread(obj);
        // Q obj1 = new Q();
        // Thread t1 = new Thread(obj1);
        // t1.start();
        // t.start();

        // Runnable obj = new K();
        // Readable obj1 = new Q();

        Runnable obj = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("hi..");
                try {
                    Thread.sleep(20);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj1 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("hi..");
                try {
                    Thread.sleep(20);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();

    }
}
