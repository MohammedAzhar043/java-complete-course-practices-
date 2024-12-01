class Mobile{

    String brand;
	int price;
	String network;
	static String name;

    static {
		name="Phone";
		System.out.println("in static block" + name);
	}
	
	public Mobile() {
		brand="";
		price=200;
		// name="Phone1";
		System.out.println("in constructor " + name);
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}

}
public class StaticBolck {
    public static void main(String[] args) throws ClassNotFoundException {
        
        // Class.forName("Mobile");
		Class.forName("Mobile");
		
        		Mobile obj1=new Mobile();
        		obj1.brand="Apple";
        		obj1.price=1500;
        		Mobile.name="SmartPhone";
        		obj1.show();
        		// Mobile obj2=new Mobile();

    }
}
