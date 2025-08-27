package recursion;


/**
 * You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.
 *
 * Example 1:
 * Input:
 *
 * n = 1
 * Output:  1
 * Explanation: Digital root of 1 is 1
 * Example 2:
 *
 * Input:
 * n = 99999
 * Output: 9
 * Explanation: Sum of digits of 99999 is 45
 * which is not a single digit number, hence
 * sum of digit of 45 is 9 which is a single
 * digit number.
 */
public class DigitalRoot {


    static int digitalRoot(int n)

    {
        int sum = findSum(n,0);
        if(sum<10)
            return sum;
        return digitalRoot(sum);
    }



    static int findSum(int n,int sum){
        if(n==0)
            return sum;
        return findSum(n/10,sum+n%10);
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(99999));
        System.out.println(digitalRoot(8));
        System.out.println(digitalRoot(10));
    }
}
