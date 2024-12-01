
class ToString12{

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
    @Override
    public String toString() {
        return "ToString12 [age=" + age + ", name=" + name + "]";
    }

    
}
public class ToString {
 
    public static void main(String[] args) {
        ToString12 s = new ToString12();
        s.setAge(24);
        s.setName("Mohammed Azhar");
        System.out.println(s.toString());

    }
}
