package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flagToCheckIfArrayIsSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flagToCheckIfArrayIsSorted = false;
                    swap(arr, j, j + 1);
                }
            }
            if (flagToCheckIfArrayIsSorted)
                break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if(i==j)
            return;
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    public static void main(String[] args) {
        final int[] arr = {3, 4, 7, 22, 45, 79, 65, 32, 57, 43, 5, 68, 53, 12, 56};


        int[] arr2 = Arrays.stream(arr).boxed().sorted().mapToInt(Integer::intValue).toArray();
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


    }
}
