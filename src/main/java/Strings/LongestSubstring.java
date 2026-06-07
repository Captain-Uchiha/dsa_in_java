package Strings;

import java.util.Scanner;

public class LongestSubstring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s  = scanner.next();
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstringSlidingWindow(s));
    }

    public static int lengthOfLongestSubstringSlidingWindow(String s) {
        int[] chars  = new int[128];
        int left = 0;
        int max = 0;

        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            left = Math.max(left,chars[c]);
            max = Math.max(max,right-left + 1);
            chars[c] = right+1;
        }
        return max;
    }
    public static int lengthOfLongestSubstring(String s) {

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<s.length();i++){
            StringBuilder subst = new StringBuilder(s.substring(i,i+1));

            for(int j = i+1;j<s.length();j++){
                char findstr = s.charAt(j);
                if(subst.toString().contains(String.valueOf(findstr)))
                {
                    int length = subst.length();
                    if(length>max){
                        max = length;
                    }
                    break;
                }else{
                    subst.append(findstr);
                }

                if(subst.length()>max){
                    max = subst.length();
                }
            }
        }
        return max;
    }
}
