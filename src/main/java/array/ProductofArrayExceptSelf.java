package array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public int[] productExceptSelfWithoutDivision(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int prefix = 1;
        for(int i =0;i<len;i++){
            res[i] = prefix;
            prefix*=nums[i];
        }

        int suffix = 1;
        for(int i = len-1;i>-1;i--)
        {
            res[i]*= suffix;
            suffix*=nums[i];
        }
        return res;
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int totalProductNoZero = 1;
        int zeroCount = 0;

        // Pass 1: Count zeros and find product of non-zero numbers
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProductNoZero *= num;
            }
        }

        // Pass 2: Fill the result array based on zero count conditions
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                res[i] = 0;
            } else if (zeroCount == 1) {
                res[i] = (nums[i] == 0) ? totalProductNoZero : 0;
            } else {
                res[i] = totalProductNoZero / nums[i];
            }
        }

        return res;
    }

    // Visual Anchor: Running the test suite inside main
    public static void main(String[] args) {
        ProductofArrayExceptSelf solver = new ProductofArrayExceptSelf();

        System.out.println("--- Running Product Except Self Test Cases ---\n");

        // Test Case 1: Standard positive numbers (No Zeros)
        int[] tc1 = {1, 2, 3, 4};
        printResult("TC1 (Standard Case)", tc1, solver.productExceptSelf(tc1));
        printResult("TC1 (Standard Case)", tc1, solver.productExceptSelfWithoutDivision(tc1));

        // Test Case 2: Contains a single zero
        int[] tc2 = {1, 2, 0, 4};
        printResult("TC2 (Exactly One Zero)", tc2, solver.productExceptSelf(tc2));
        printResult("TC2 (Exactly One Zero)", tc2, solver.productExceptSelfWithoutDivision(tc2));

        // Test Case 3: Contains multiple zeros
        int[] tc3 = {1, 0, 3, 0};
        printResult("TC3 (Multiple Zeros)", tc3, solver.productExceptSelf(tc3));
        printResult("TC3 (Multiple Zeros)", tc3, solver.productExceptSelfWithoutDivision(tc3));

        // Test Case 4: Negative and positive numbers mixed
        int[] tc4 = {-1, 1, 0, -3, 3};
        printResult("TC4 (Mixed Negatives & One Zero)", tc4, solver.productExceptSelf(tc4));
        printResult("TC4 (Mixed Negatives & One Zero)", tc4, solver.productExceptSelfWithoutDivision(tc4));

        // Test Case 5: Minimal structural array (Size 2)
        int[] tc5 = {5, -2};
        printResult("TC5 (Minimum Array Size)", tc5, solver.productExceptSelf(tc5));
        printResult("TC5 (Minimum Array Size)", tc5, solver.productExceptSelfWithoutDivision(tc5));
    }

    // Helper method to display outputs cleanly
    private static void printResult(String testName, int[] input, int[] output) {
        System.out.println(testName);
        System.out.println("Input:  " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(output));
        System.out.println();
    }
}
