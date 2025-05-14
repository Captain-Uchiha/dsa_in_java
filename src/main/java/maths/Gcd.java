package maths;

public class Gcd {

    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args){
        System.out.println(gcd(60,36));    // Output: 12
        System.out.println(gcd(10, 5));    // Output: 5
        System.out.println(gcd(8, 12));    // Output: 4
        System.out.println(gcd(100, 25));  // Output: 25
        System.out.println(gcd(81, 27));   // Output: 27

    }

}
