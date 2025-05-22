package maths;

public class PowerOfn {


    private static long pow(int x,int n ){
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        long k = pow(x, n / 2);
        if(n%2==0) {
            return k*k;
        }
        return x*k*k;

    }

    public static void main(String[] args){
        System.out.println(pow(3,3));
        System.out.println(pow(2,8));
    }

}
