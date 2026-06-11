package array;

public class RotatedSortedArray {
    public static void main(String[] args) {
        RotatedSortedArray solver = new RotatedSortedArray();

        System.out.println("--- Running Test Cases ---");

        // 🧪 Example 1: Standard rotated sorted array
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Output 1: " + solver.check(nums1));
        System.out.println("Expected: true\n");

        // 🧪 Example 2: Invalid rotated array (drops multiple times)
        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Output 2: " + solver.check(nums2));
        System.out.println("Expected: false\n");

        // 🧪 Example 3: Already sorted array (0 rotations)
        int[] nums3 = {1, 2, 3};
        System.out.println("Output 3: " + solver.check(nums3));
        System.out.println("Expected: true\n");

        // 🧪 Example 4: Edge case with all duplicate elements
        int[] nums4 = {1, 1, 1};
        System.out.println("Output 4: " + solver.check(nums4));
        System.out.println("Expected: true\n");

        // 🧪 Example 5: Duplicates with a valid rotation
        int[] nums5 = {2, 2, 1, 2, 2};
        System.out.println("Output 5: " + solver.check(nums5));
        System.out.println("Expected: true\n");
    }

    /**
     * Checks if the array was originally sorted in non-decreasing order,
     * then rotated some number of positions.
     * * Time Complexity: O(n) - Single pass through the array.
     * Space Complexity: O(1) - Constant auxiliary space used.
     */
    public boolean check(int[] nums) {
        int dropCount = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with the next element.
            // Using (i + 1) % n cleanly wraps the final element back to index 0.
            if (nums[i] > nums[(i + 1) % n]) {
                dropCount++;
            }
        }

        // A valid rotated sorted array can have at most 1 drop point.
        return dropCount <= 1;
    }
}