import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    
    public static void main(String[] args) {
        
        List<Integer> set = Arrays.asList(1,2,3,7,8,9,10,20,2,8,40,10,9);
        // List<Integer> set = Arrays.;


        System.out.println(set);
        Stream<Integer> sett = set.stream().filter(n-> n%2==0);
        sett.forEach(n -> System.out.println(n));
        // System.out.println(sett);
        // set.forEach(n -> System.out.println(n));

        // Stream<Integer> sett= set.stream().filter(n -> n%2==0);
        System.out.println("hiiiii... ");
        Stream<Integer> sett1= set.stream().map(n -> n*2);
        sett1.forEach(n -> System.out.println(n));

             
        // int result = set.stream();

    }
}
