class Mobile {

    String brand;
    int price;
    // String name;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("in static method");
        // System.out.println(brand+" : "+price+" : "+name);
        // it is throughing error,we cant use non static variables inside the static
        // method
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
        
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        Mobile obj = new Mobile();
        obj.brand = "MI";
        obj.price = 12000;
        Mobile.name = "redmi pro 12";

        // System.out.println(obj.brand+" "+Mobile.name+" "+obj.price);

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.name="SmartPhone";
        Mobile.name = "SmartPhone";

        // obj1.name="Phone";
        Mobile.name = "SmartPhone";

        // obj.show();
        // obj2.show();

        Mobile.show1(obj);

    }
}
