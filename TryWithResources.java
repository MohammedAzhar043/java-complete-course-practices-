import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        // int i = 0;
        // int j = 0;
        // try {
        // j = 18 / j;
        // } catch (Exception e) {
        // System.out.println("something went wrong...." + e);
        // System.out.println("bye");
        // }
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader buf = new BufferedReader(in);
        // int num;

        // try {
        //     int a = Integer.parseInt(buf.readLine());
        //     if (a % 2 == 0)
        //         System.out.println("even number....");
        //     else {
        //         System.out.println("odd number...");
        //     }
        // } catch (Exception e) {
        //     System.out.println("something went wrong...." + e);
        //     ;
        // }
        int num=0;
    	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
    	{
    		num=Integer.parseInt(br.readLine());
    		System.out.println(num);
    	}
    	finally
    	{
    		// br.close();
    	}




    }
}
