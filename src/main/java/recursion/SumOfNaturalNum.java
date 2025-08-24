package recursion;

public class SumOfNaturalNum {


    public  static int sum(int n){
        if(n==1 || n==0)
            return n;
        return n + sum(n-1);
    }

    public static int sumOpt(int n,int sum){
        if(n<=0)
            return sum;
        return sumOpt(n-1,sum+n);
    }
    public static void main(String[] args) {
        System.out.println(sum(6));
        System.out.println(sumOpt(6,0));
    }
}
