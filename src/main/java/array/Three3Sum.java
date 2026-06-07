package array;

import java.util.*;

public class Three3Sum {

    public static void main(String[] args) {

        Three3Sum solver = new Three3Sum();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Output 1: " + solver.threeSum(nums1));
        System.out.println("Expected: [[-1, -1, 2], [-1, 0, 1]]\n");

        int[] nums2 = {0, 1, 1};
        System.out.println("Output 2: " + solver.threeSum(nums2));
        System.out.println("Expected: []\n");

        // 🧪 Example 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Output 3: " + solver.threeSum(nums3));
        System.out.println("Expected: [[0, 0, 0]]\n");
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){

            if(i>0 && (nums[i] == nums[i-1]))
                continue;

           int left = i+1;
           int right = nums.length-1;

           while(left<right){
               int sum = nums[i] + nums[left] + nums[right] ;
               if(sum==0)
               {
                   result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                   while(left<right&& nums[left]== nums[left+1]) left++;
                   while(left<right && nums[right]== nums[right-1]) right++;

                   left++;
                   right--;
               }
               else if(sum>0){
                   right--;
               }else {
                   left++;
               }
           }

        }

        return result;
    }



}
