package array;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LeftRotateArrayByD {

    @FunctionalInterface
    interface TriConsumer<T, U, V> {
       void   accept(T t, U u, V v);
    }

    private static final TriConsumer<int[],Integer,Integer> reverseArray = (arr, startPos, finalPos)->{

        while(startPos<finalPos)
        {
            int temp = arr[startPos];
            arr[startPos++]= arr[finalPos];
            arr[finalPos--]= temp;
        }
    };

    public static BiConsumer<int[],Integer> LeftRotateArrayByD = (arr, d)->{
        reverseArray.accept(arr,0,d-1);
        reverseArray.accept(arr,d,arr.length-1);
        reverseArray.accept(arr,0,arr.length-1);
    };


    public static void main(String[] args){
        int[] test1 = new int[]{1,2,3,4,5};
        LeftRotateArrayByD.accept(test1, 2);
        System.out.println(Arrays.toString(test1));
        // solution -- 3,4,5,1,2

    }



}
