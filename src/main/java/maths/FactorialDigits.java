package maths;

public class FactorialDigits {

    private static int countDigitsInFactorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1)
            return 1;

        double digits = 1;
        for (int i = 2; i <= n; i++) {
            digits += Math.log10(i);
        }

        return (int) digits ;
    }

    public static void main(String[] args) {
        System.out.println(countDigitsInFactorial(5));    // Output: 3 (120)
        System.out.println(countDigitsInFactorial(10));   // Output: 7 (3628800)
        System.out.println(countDigitsInFactorial(120));  // Output: 199
        System.out.println(countDigitsInFactorial(1000)); // Output: 2568
    }
}
