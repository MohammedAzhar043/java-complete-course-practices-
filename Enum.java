enum students {
    running, playing, reading, eating, sleeping;
}

public class Enum {
    public static void main(String[] args) {

        students s = students.reading;
        System.out.println(s);

        // students[] ss = students.values();
        // System.out.println(ss[1]);

        // for(students sss : ss){
        // System.out.println(sss);
        // }

        // switch (s) {
        // case running:
        // System.out.println("running in the ground");
        // break;
        // case playing:
        // System.out.println("playing in the ground.....");
        // break;
        // case eating:
        // System.out.println("eatting in the ground");
        // break;
        // case reading:
        // System.out.println("playing in the ground.....");
        // break;
        // default:

        // break;
        // }
        if (s.equals(students.eating))
            System.out.println("they are eating");
        else if(s.equals(students.reading)){
            System.out.println("They are reading");
        }
        else{
            System.out.println("No worries");
        }
    }

}
