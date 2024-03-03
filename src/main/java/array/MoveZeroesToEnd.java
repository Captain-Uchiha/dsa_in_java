package array;

public class MoveZeroesToEnd {
    public static void swap(int[] arr, int a, int b) {
        if (a == b)
            return;
        arr[a] = arr[b];
        arr[b] = 0;
    }

    public static int[] moveZeroes(int[] arr) {
        int nonZeroElementIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, nonZeroElementIndex, i);
                nonZeroElementIndex++;
            }
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] testCase_1 = new int[]{10, 5, 0, 0, 2, 4, 2, 0, 20, 0, 49};
        int[] testCase_2 = new int[]{20, 10, 0, 8, 12, 0, 0, 0, 2, 2, 0, 2};

        print(moveZeroes(testCase_1));
        print(moveZeroes(testCase_2));
    }
}
