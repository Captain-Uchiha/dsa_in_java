package maths;

class ConvertCelciusToFarenheit {
    private  static double cToF(int C) {
        return (C * 9.0 / 5.0) + 32;
    }
/*
Note :  here use 9.0 and 5.0 to avoid integer truncation
 */
    public static void main(String[] args) {
        System.out.println("C = 32, F = " + ConvertCelciusToFarenheit.cToF(32));  // Output: 89.6
        System.out.println("C = 50, F = " + ConvertCelciusToFarenheit.cToF(50));  // Output: 122.0
    }
}