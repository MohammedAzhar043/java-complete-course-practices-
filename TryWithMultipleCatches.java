public class TryWithMultipleCatches {

    public static void main(String[] args) {

        int i = 6, j = 0;
        int a[] = new int[5];
        String s = null;
        try {
            j = 18 / i;
            System.out.println(s.length());
            System.out.println(a[8]);
            System.out.println(j);

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("something went wrong " + e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
