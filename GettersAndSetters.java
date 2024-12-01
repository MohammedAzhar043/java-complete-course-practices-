class Getters{

    private int salary;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class GettersAndSetters {
    
    public static void main(String[] args) {
        
        Getters g  = new Getters();
        g.setName("mohammed");
        g.setSalary(26000);
        System.out.println(g.getName());
        System.out.println(g.getSalary());
    }
}
