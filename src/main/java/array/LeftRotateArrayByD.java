package array;

import java.util.Arrays;
import java.util.function.BiFunction;

public class LeftRotateArrayByD {

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    private static final TriFunction<int[],Integer,Integer, int[]> reverseArray = (arr, startPos, finalPos)->{

        while(startPos<finalPos)
        {
            int temp = arr[startPos];
            arr[startPos++]= arr[finalPos];
            arr[finalPos--]= temp;
        }
        return arr;
    };

    public static BiFunction<int[],Integer,int[]> LeftRotateArrayByD = (arr,d)->{
        reverseArray.apply(arr,0,d-1);
        reverseArray.apply(arr,d,arr.length-1);
        reverseArray.apply(arr,0,arr.length-1);

        return arr;
    };


    public static void main(String[] args){
        int[] test1 = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(LeftRotateArrayByD.apply(test1, 2)));
        // solution -- 3,4,5,1,2

    }



}
