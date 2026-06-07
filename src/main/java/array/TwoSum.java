package array;


import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //    int arr[] = new int[2];
        //    for(int i =0;i<nums.length;i++)
        //     {
        //      int c = 0;
        //             for(int j = i+1;j<nums.length;j++)
        //             {
        //                if(nums[i]+nums[j]==target)
        //                {
        //                    arr[0]=i;
        //                    arr[1]=j;
        //                    c=1;
        //                    break;
        //             }
        //                if(c==1)
        //                    break;

        //         }
        //     }
        //     return arr;

        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int searchValue = target - nums[i];
            if(map.containsKey(searchValue)){
                arr[0] = map.get(i);
                arr[1] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}