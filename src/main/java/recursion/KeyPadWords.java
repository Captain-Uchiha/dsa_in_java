package recursion;

import java.util.HashMap;
import java.util.Map;

public class KeyPadWords {

    private static final Map<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4};
        printCombinations(arr, 0, "");

    }

    public static void printCombinations(int[] arr, int index, String combination) {
        if (index == arr.length) {
            System.out.println(combination);
            return;
        }
        String letters = map.get(arr[index]);
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            printCombinations(arr, index + 1, combination + ch);
        }
    }
}