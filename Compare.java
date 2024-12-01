import java.util.ArrayList;
import java.util.List;

class student123 implements Comparable {

    int age;
    String name;

    public student123(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(student123 that) {

        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}

public class Compare {

    public static void main(String[] args) {

        List<student123> studs = new ArrayList<>();
        studs.add(new student123(21, "Navin"));
        studs.add(new student123(12, "John"));
        studs.add(new student123(18, "Parul"));
        studs.add(new student123(20, "Kiran"));

    }
}
