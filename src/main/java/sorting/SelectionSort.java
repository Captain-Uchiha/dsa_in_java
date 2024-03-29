package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
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
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
