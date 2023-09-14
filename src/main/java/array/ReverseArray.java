package array;

import java.util.Arrays;

public class ReverseArray {

    // reverse an array

    private static int[] reverseArray(int[] arr){
        int i = 0;
        int len = arr.length-1;
        while(i<len){
            int temp = arr[i];
            arr[i++] = arr[len];
            arr[len--]=temp;
        }
        return arr;
    }



    public static void main(String[] args){
        int[] test1 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(test1)));

        int[]test2 = new int[3];
        System.out.println(Arrays.toString(test2));

    }
}
