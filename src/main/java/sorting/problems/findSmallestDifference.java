package sorting.problems;

import java.util.Arrays;

public class findSmallestDifference {

    public static int smallestDifferencePair(int[] arr1, int n,
                                             int[] arr2, int m)
    {

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p=0,q=0;
        int min = Integer.MAX_VALUE;
        while(p<n && q<m)
        {
            min = Math.min(min,Math.abs(arr1[p]-arr2[q]));
            if(arr1[p]>arr2[q])
                q++;
            else
                p++;
        }
        return min;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {3,5,2,4,6,7};
        int[] arr2 = {12,56,8,1};

        int result = findSmallestDifference.
                smallestDifferencePair(arr1,6,arr2,4);
        System.out.println(result);
    }
}
