package array;

import java.util.Arrays;

public class LargestElementInArray {


    // dsa_approach
    public static int getLargest(int[] arr)
    {
        if(arr.length==0)
            return -1;

        int res = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>res)
                res = arr[i];
        }
        return res;
    }

    // streams_approach
    public static int getLargestUsingStreams(int[] arr) {

        return Arrays.stream(arr).max().orElse(-1);
    }

    public  static void main(String[] args)
    {
        int[] arr = new int[]{5,8,20,10};
        System.out.println(getLargest(arr));

        System.out.println(getLargestUsingStreams(arr));
    }


}