
public class DynamicMethodDispatch {

    public static void main(String[] args) {

        A1 obj = new A1();
        obj.show();
    }
}


class A1 {
    public void show() {
        System.out.println("In A show");
    }
}

class B1 extends A1 {
    public void show() {
        System.out.println("In B show");
    }
}

class C1 extends A1 {
    public void show() {
        System.out.println("In C show");
    }
}
