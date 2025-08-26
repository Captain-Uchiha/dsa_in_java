package recursion;

public class MaxCutsInRope {

//    Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B and C. The task is to maximizes the number of cuts in rope. If it is impossible to make cut then print the number else print -1. Examples:
//    Input:
//    N = 17, A = 10, B = 11, C = 3
//    Output: 3
//    Explanation: The maximum cut can be obtain after making 2 cut of length 3 and one cut of length 11.
//    Input: N = 10, A = 9, B = 7, C = 11
//
//    Output: -1
//    Explanation: It is impossible to make any cut so output will be -1

//    static int maxCuts(int n, int a, int b, int c) {
//        int[] dp = new int[n + 1];
//        for (int i = 1; i <= n; i++) dp[i] = -1; // initialize all to -1
//        dp[0] = 0; // base case
//
//        for (int i = 1; i <= n; i++) {
//            if (i - a >= 0 && dp[i - a] != -1)
//                dp[i] = Math.max(dp[i], dp[i - a] + 1);
//            if (i - b >= 0 && dp[i - b] != -1)
//                dp[i] = Math.max(dp[i], dp[i - b] + 1);
//            if (i - c >= 0 && dp[i - c] != -1)
//                dp[i] = Math.max(dp[i], dp[i - c] + 1);
//        }
//        return dp[n];
//    }


    static int maxCuts(int n,int a,int b,int c){
        if(n==0)
            return 0;
        if(n<=-1)
            return -1;

        int res = Math.max(maxCuts(n-a,a,b,c),
                Math.max(maxCuts(n-b,a,b,c),maxCuts(n-c,a,b,c)));

        if(res==-1)
            return -1;
        return res+1;
    }
    public static void main(String[] args) {
        System.out.println(maxCuts(5,3,9,3));
    }
}
