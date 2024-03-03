package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    // return count of unique elements in a sorted array

    public static int countOfUniqueElements(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        int[] testCase_1 = new int[]{10, 10, 20, 40};
        int[] testCase_2 = new int[]{22, 22, 22, 22};
        int[] testCase_3 = new int[]{10};

        System.out.println(countOfUniqueElements(testCase_1));
        System.out.println(countOfUniqueElements(testCase_2));
        System.out.println(countOfUniqueElements(testCase_3));

    }
}
