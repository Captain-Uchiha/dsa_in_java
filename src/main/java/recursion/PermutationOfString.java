package recursion;

import java.util.Arrays;

public class PermutationOfString {


    public static void main(String[] args) {
        String a = "abc";
        permute(a,0,2);
        System.out.println(a);
    }


    public static String swapChars(String input,int i,int j){
        char[] arr = input.toCharArray();
        char a = arr[i];
        arr[i]=arr[j];
        arr[j] = a;
        return String.valueOf(arr);
    }


    public static void permute (String str,int start,int end){

        if(start==end)
            System.out.println(str);
        else
        {
            for (int i = start;i<=end;i++){
                str = swapChars(str,start,i);
                permute(str,start+1,end);
                str = swapChars(str,start,i);
            }
        }
    }

    
}
