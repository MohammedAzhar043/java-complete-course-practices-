import java.util.HashMap;

public class Hashing {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Mohammed", 10);
        students.put("azhar", 20);

        students.put("anas", 30);

        students.put("junaid", 18);
        students.put("mujahid", 28);

        // System.out.println(students);

        // System.out.println(students.keySet());
        // System.out.println(students.values());

        for (String string : students.keySet()) {
         
            System.out.println(string + " " + students.get(string));
        }
    }
}
