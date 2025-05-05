package maths;

public class CountDigits {


    private static int solution(long inputNo){

        if(inputNo==0)
            return 1;
        return countDigitsByRecursion(inputNo);
    }

    private static int countDigitsByRecursion(long inputNo){
        if(inputNo==0)
            return 0;
        return 1 + countDigitsByRecursion(inputNo/10);
    }

    private static int countDigitsByIteration(long inputNo){
        if(inputNo==0)
            return 0;
        int count = 0;
        while(inputNo!=0)
        {
            inputNo/=10;
            ++count;
        }
        return count;
    }


    public static void main(String[] args){

        // Test cases for solution() method (which uses recursion)
        long input1 = 0;
        if (1 == (solution(input1)))
            System.out.println("Test case 1 (solution) passed");

        long input2 = 12345;
        if (5 == (solution(input2)))
            System.out.println("Test case 2 (solution) passed");

        long input3 = -430;
        if (3 == solution(input3))
            System.out.println("Test case 3 (solution) passed");

        // Test cases for countDigitsByIteration() method
        long input4 = 0;
        if (1 == countDigitsByIteration(input4))
            System.out.println("Test case 4 (iteration) passed");

        long input5 = 789;
        if (3 == countDigitsByIteration(input5))
            System.out.println("Test case 5 (iteration) passed");

        long input6 = -10000;
        if (5 == countDigitsByIteration(Math.abs(input6))) // handle negative
            System.out.println("Test case 6 (iteration) passed");
    }


}
