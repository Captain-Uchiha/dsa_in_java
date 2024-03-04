package searching;

import java.util.Scanner;

public class BinarySearch {

    private static int binarySearch(final int []nums,final int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l +((r-l)>>>2);
            if(nums[mid]==target)
                return mid;
            else if (nums[mid]>target) {
                r=mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] nums = {2,4,7,8,12,17,19};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search ");
        int n = sc.nextInt();
        System.out.println("found the element at index : "+binarySearch(nums,n));
    }

}
