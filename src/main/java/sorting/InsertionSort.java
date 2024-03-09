package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];
            while(j>=0&&(arr[j]>key))
            {
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }

    private static void swap(int[] arr, int i, int j) {
        if(arr[i]==arr[j])
            return;
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    public static void main(String[] args) {
        final int[] arr = {3, 4, 7, 22, 45, 79, 65, 32, 57, 43, 5, 68, 53, 12, 56};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
