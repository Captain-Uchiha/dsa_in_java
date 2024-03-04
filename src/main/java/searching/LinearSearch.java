package searching;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LinearSearch {

    private static Integer linearSearchWithoutStreams(int n , Integer[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] ==n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        final Integer[] arr = {3,4,7,22,45,79,65,32,57,43,5,68,53,12,56};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search ");
        int n = sc.nextInt();
        System.out.println("index of element is : "+linearSearchWithoutStreams(n,arr));

    }
}
