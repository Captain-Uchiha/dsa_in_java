package maths;

public class TrailingZeroes {

    public static int countTrailingZeroes(int n) {
        int count = 0;
        
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTrailingZeroes(100));  // Output: 24
        System.out.println(countTrailingZeroes(25));   // Output: 6
        System.out.println(countTrailingZeroes(50));   // Output: 12
        System.out.println(countTrailingZeroes(10));   // Output: 2
    }
}
