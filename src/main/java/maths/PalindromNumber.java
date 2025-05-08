package maths;

public class PalindromNumber {

    private static boolean isPalindromeNumber(int input) {
        int reverse = 0;
        int temp = input;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == input;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121)); // true
        System.out.println(isPalindromeNumber(123)); // false
        System.out.println(isPalindromeNumber(1221)); // true
        System.out.println(isPalindromeNumber(10)); // false
    }
}
