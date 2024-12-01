class Human {

    public Human() {
        System.out.println("we are in constructor");
        age = 20;
        name = "Mohammed Azhar";
    }
    public Human(int a, String n)  //Parameterized constructor
	{
		age=a;
		name=n;
	}

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

}

public class Demo4 {
    public static void main(String[] args) {

        Human obj = new Human();
        // System.out.println(obj.getAge() + " " + obj.getName());
        obj.setAge(30);
		obj.setName("Reddy");
		

		System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
