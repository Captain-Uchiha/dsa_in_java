package maths;

public class CheckPrimeNumber {


    public static boolean isPrimeNormalMethod(int input){

        if(input<=1)
            return false;

       boolean isPrime = true;
        for(int i = 2;i<=Math.sqrt(input);i++){
            if(input%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static  boolean optimizedMethod(int input){
        if(input<=1)
            return false;
        if(input==2 || input==3)
            return true;
        if(input%2==0 || input%3==0)
            return false;

        for(int i = 5;i<=Math.sqrt(input);i=i+6){
            if(input%i==0 || input%(i+2)==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        // Normal Method Tests
        System.out.println(isPrimeNormalMethod(1));    // false (edge case)
        System.out.println(isPrimeNormalMethod(2));    // true  (smallest prime)
        System.out.println(isPrimeNormalMethod(3));    // true
        System.out.println(isPrimeNormalMethod(4));    // false
        System.out.println(isPrimeNormalMethod(17));   // true
        System.out.println(isPrimeNormalMethod(100));  // false
        System.out.println(isPrimeNormalMethod(997));  // true (large prime)

        // Optimized Method Tests
        System.out.println(optimizedMethod(1));        // false
        System.out.println(optimizedMethod(2));        // true
        System.out.println(optimizedMethod(3));        // true
        System.out.println(optimizedMethod(4));        // false
        System.out.println(optimizedMethod(25));       // false
        System.out.println(optimizedMethod(29));       // true
        System.out.println(optimizedMethod(121));      // false (11 * 11)
        System.out.println(optimizedMethod(1039));     // true (prime)
        System.out.println(optimizedMethod(1040));     // false
    }

}
