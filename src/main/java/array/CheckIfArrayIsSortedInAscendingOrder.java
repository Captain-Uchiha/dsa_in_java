package array;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.IntStream;

public class CheckIfArrayIsSortedInAscendingOrder {

    // dsa_method
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    // streams
    public static boolean isSortedUsingStreams(int[] arr) {

        return IntStream.range(1, arr.length)
                .sequential()
                .filter(i -> arr[i] < arr[i - 1])
                .findFirst().
                isEmpty();

//        public static boolean isSorted(int[] arr) {
//        return Arrays.stream(arr)
//                .sorted()
//                .toArray() // Collect sorted elements back into an array
//                .equals(arr); // Compare with original array
//    }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5, 10, 15, 20};
        int[] arr1 = new int[]{5, 2, 1};

        long start = System.currentTimeMillis();
        System.out.println("success case : " + isSorted(arr));
        System.out.println("failure case : " + isSorted(arr1));
        long end = System.currentTimeMillis();

        System.out.println("NormalMethod : " + (end - start));


        long startStream = System.currentTimeMillis();
        System.out.println("success case : " + isSortedUsingStreams(arr));
        System.out.println("failure case : " + isSortedUsingStreams(arr1));
        long endStream = System.currentTimeMillis();

        System.out.println("Streams Method : " + (endStream - startStream));

    }
}
