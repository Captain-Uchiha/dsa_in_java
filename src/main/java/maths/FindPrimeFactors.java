package maths;

import java.util.List;

public class FindPrimeFactors {


    public static void primeFactors(int n) {

        if (n <= 1)
            System.out.println("No prime Factors");

        while (n % 2 == 0) {
            System.out.print("\t" + 2);
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print("\t" + i);
                n /= i;
            }
        }
        if (n > 2)
            System.out.print("\t" + n);

    }

    public static void main(String[] args) {
        primeFactors(60);  // Expected: 2, 2, 3, 5
        System.out.println("\n -----");
        primeFactors(13);  // Expected: 13
        System.out.println("\n -----");
        primeFactors(100); // Expected: 2, 2, 5, 5
        System.out.println("\n -----");
        primeFactors(1);   // Expected: No prime factors
    }
}