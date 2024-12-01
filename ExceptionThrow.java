class AzharException extends Exception {

    public AzharException(String str) {
        super(str);
        // System.out.println("hello....");
    }

}

public class ExceptionThrow {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {

                throw new AzharException("i dont want to print the zero");
                // throw new ArithmeticException("I don't want to do print zero");
            }
        }

        catch (AzharException e) {
            System.out.println("hello...");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            // j=18/i;
            // System.out.println("that is default output"+e);
        }
    }
}
