package recursion;

import java.util.Arrays;

public class PermutationIterative {

    public static void main(String[] args) {
        String str = "abc";

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        do {
            System.out.println(String.valueOf(arr));
        } while (nextPermutation(arr));
    }

    public static boolean nextPermutation(char[] arr) {

        int n = arr.length;

        // Step 1: Find first decreasing element from right
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i < 0)
            return false; // No more permutations

        // Step 2: Find just larger element on right
        int j = n - 1;
        while (arr[j] <= arr[i])
            j--;

        // Step 3: Swap them
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: Reverse right side
        reverse(arr, i + 1, n - 1);

        return true;
    }

    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
