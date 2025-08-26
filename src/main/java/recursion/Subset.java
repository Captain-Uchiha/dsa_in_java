package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    static void subset(String original,String current,int cIdx){


        for(int i = cIdx;i<original.length();i++){
            String temp = current + original.charAt(i);
            System.out.println(temp);
            subset(original,temp,i+1);
        }

    }

    static void powerSet(String str, int index, String curr)

    {
        int n = str.length();

        // base case
        if (index == n) {
            System.out.println(curr);
            return;
        }

        // Two cases for every character
        // (i) We consider the character
        // as part of current subset
        // (ii) We do not consider current
        // character as part of current
        // subset
        powerSet(str, index + 1, curr + str.charAt(index));
        powerSet(str, index + 1, curr);
    }

    public static void main(String[] args) {
//        subset("abc","",0);
        powerSet("abc",0,"");
        System.out.println(generatePowerSet("abc"));
    }

    static List<String> generatePowerSet(String str) {
        int n = str.length();
        List<String> result = new ArrayList<>();
        int total = 1 << n; // 2^n subsets

        for (int mask = 0; mask < total; mask++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) { // check if j-th bit is set
                    subset.append(str.charAt(j));
                }
            }
            result.add(subset.toString());
        }
        return result;
    }
}

//
//           ""
//                   /      \
//a        ""
//        /   \      /  \
//ab    a     b    ""
//        /  \   / \   / \   / \
//abc ab ac  a bc  b c