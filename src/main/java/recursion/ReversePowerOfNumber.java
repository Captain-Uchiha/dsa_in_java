package recursion;

// reverse power of a number and find its power like n = 23
// then find the power of 23^32

public class ReversePowerOfNumber {



    public static long reverseANum(long k,long temp){
        if(k==0)
            return temp;
        temp = temp * 10 + k % 10;
        return reverseANum(k/10,temp);
    }

    public static long reverseAnumOptimized(long k){
        if(k<10)
            return k;
        return (k%10 * (int)Math.pow(10,(int)(Math.log10(k))) + reverseAnumOptimized(k/10));
    }

    public static void main(String args[]){
        long k = 10 ;
        System.out.println(reverseANum(k,0));
        System.out.println(reverseAnumOptimized(k));
        System.out.println(Math.pow(k,reverseANum(k,0)));
        System.out.println(Math.pow(k,reverseAnumOptimized(k)));


    }


}
