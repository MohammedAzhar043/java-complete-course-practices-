import java.util.Scanner;

public class Jagged {
    public static void main(Strings[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the vslues for" + arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =sc.nextInt();
            }
        }
        for (int a[] : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}