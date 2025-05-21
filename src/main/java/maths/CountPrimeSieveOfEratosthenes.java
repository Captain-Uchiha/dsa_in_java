package maths;

import java.util.Arrays;

public class CountPrimeSieveOfEratosthenes {



    private static int countPrimes(int n){

        if(n<2)
            return 0;

        boolean[] arr = new boolean[n];
        Arrays.fill(arr,true);

        int count = 0;

        for (int i = 2;i<n;i++)
        {
            if(arr[i]) {
                count++;
                for (long j = (long) i * i; j <n; j = j + i) {
                        arr[(int)j] = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countPrimes(499980));
    }

}
