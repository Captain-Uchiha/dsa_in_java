package sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeArrays(int[] arr,int[] arr2)
    {
        int i =0, j = 0,k = 0;
        int length1 = arr.length;
        int length2 = arr2.length;
        int[] arr3 = new int[length2+length1];
        while(i<length1  && j<length2)
        {
            if(arr[i]>arr2[j])
            {
                arr3[k++]= arr2[j++];
            }else{
                arr3[k++]= arr[i++];
            }
        }

        for(;i<length1;i++)
        {
            arr3[k++] = arr[i];
        }

        for(;j<length2;j++)
        {
            arr3[k++] = arr2[j];
        }
        return arr3;
    }

    public static void main(String[] args) {
        final int[] arr = {1, 4, 7, 22,53};
        final int[] arr2 = {2, 3,4, 8, 11,56};
        System.out.println(Arrays.toString(mergeArrays(arr,arr2)));


    }
}
