package array;

import java.util.Scanner;

public class ContinuousSubarraySum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums  = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        System.out.println(checkSubarraySum(nums,k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {

        for(int i = 0;i<nums.length;i++){
            int sum = nums[i];
            if(isMultiple(sum,k))
                return true;
            for(int j = i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if (isMultiple(sum,k))
                    return true;
            }
        }
        return false;

    }

    public static boolean isMultiple(int a, int k){
        return a%k==0;
    }
}
