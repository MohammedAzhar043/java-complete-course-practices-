public class Array {

    public static void main(Strings[] args) {

        // int arr[]={1,2,3};
        // System.out.println(arr[0]);
        // // int i=5;
        // // int j=6;
        // // int k=7;
        // // int num[]= {5,6,7};
        // int num[]=new int[4];
        // for (int i : num) {
        // System.out.println(i);
        // }

        // int nums[]= {3,7,2,4};
        // nums[1]=6;
        // System.out.println(nums[1]);

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }

    }
}
