package maths;

import java.util.SortedSet;
import java.util.TreeSet;

public class AllDivisorsOfaNumber {


    public static void allDivisors(int n){
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sortedSet.add(i);
                sortedSet.add(n/i);
            }
        }
        System.out.println(sortedSet);
    }

    public static void main(String[] args){
        allDivisors(100);
    }
}
