interface Expression {
    // void show();
    // void show(int a);
    void show(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Expression obj = ()-> System.out.println("in blank show");
        // obj.show();

        // Expression obj = new Expression() {
        // public void show(int a){
        // System.out.println("in a implementation of interface.....");
        // }
        // };
        // obj.show(10);
        // Expression obj = (a) -> System.out.println("in a parmetartised show " + a);
        // obj.show(10);

        // Expression obj = new Expression() {
        //     public void show(int a, int b) {
        //         System.out.println("we are in parametarised show " + a + " and " + b);
        //     }
        // };
        // obj.show(10, 20);

        // Expression obj = (a,b) -> System.out.println("a and b is ab");
        // obj.show(10, 2);
        // Expression obj = ( a , b)->  System.out.println("The value of a is "+ a +" and the value of b is "+b);
        Expression obj = (a,b)-> System.out.println(a+b);
         
    }

}
