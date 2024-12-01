public class Switch {

    public static void main(Strings[] args) {

        // int n=1;
        // if(n==1)
        // System.out.println("Monday");
        // else if(n==2)
        // System.out.println("Tuesday");
        // else if(n==3)
        // System.out.println("Wednesday");
        // else if(n==4)
        // System.out.println("Thursday");
        // else if(n==5)
        // System.out.println("Friday");
        // else if(n==6)
        // System.out.println("Saturday");
        // else
        // System.out.println("Sunday");

        int n = 6;
        switch (n) {
            case 1 ->
                System.out.println("Monday");

            case 2 ->
                System.out.println("Tuesday");

            case 3 ->
                System.out.println("Wednesday");

            case 4 ->
                System.out.println("Thursday");

            case 5 ->
                System.out.println("Friday");

            case 6 ->
                System.out.println("Saturday");

            case 7 ->
                System.out.println("Sunday");

            default -> System.out.println("Enter a valid number");
        }
    }
}
