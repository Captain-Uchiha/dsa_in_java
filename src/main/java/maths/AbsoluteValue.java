package maths;

public class AbsoluteValue {

    private static int absoluteValue(int input) {
        if (input >= 0)
            return input;
        return input * (-1);
    }

    public static void main(String[] args) {
        int[] testInputs = {-32, 45, 0, -1, 100, -999};
        for (int input : testInputs) {
            int result = absoluteValue(input);
            System.out.println("Input: " + input + " -> Absolute Value: " + result);
        }
    }
}

