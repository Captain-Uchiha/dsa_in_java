package maths;

public class FactorialNumber {

    private static long findFactorial(long input) {
        if (input < 0)
            return -1;
        if (input == 0 || input == 1)
            return 1;

        long solution = 1;
        for (long i = input; i > 1; i--) {
            solution *= i;
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));   // 120
        System.out.println(findFactorial(0));   // 1
        System.out.println(findFactorial(20));  // 2432902008176640000
        System.out.println(findFactorial(21));  // overflow happens here
        System.out.println(findFactorial(-3));  // -1
    }
}
