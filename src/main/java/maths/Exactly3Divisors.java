package maths;

import java.util.ArrayList;
import java.util.List;

public class Exactly3Divisors {


    public static void has3DivisorOrNot(int n){
         if(n<=3)
             return;

         List<Integer> exactly3DivisorList = new ArrayList<>();

         for(int i = 2;i<Math.sqrt(n);i++){
             if(CheckPrimeNumber.optimizedMethod(i) && i*i<n)
                exactly3DivisorList.add(i*i);
         }
        System.out.println(exactly3DivisorList);
    }

    public static void main(String[] args){
        has3DivisorOrNot(100);
    }
}
