package array;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SecondLargestElementInArray {

    public static int findSecondLargest(int[] arr) {
        if (arr.length <= 1) {
            return -1; // Not enough elements to find the second-largest
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // No second-largest element found
        }
        return secondLargest;
    }


    public static void main(String[] args) {

        int[] testCase_1 = new int[]{10, 5, 8, 20};
        int[] testCase_2 = new int[]{20, 10, 20, 8, 12};
        int[] testCase_3 = new int[]{10, 10, 10};

        System.out.println(findSecondLargest(testCase_1));
        System.out.println(findSecondLargest(testCase_2));
        System.out.println(findSecondLargest(testCase_3));
    }
}
