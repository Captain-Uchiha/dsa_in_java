package array;

import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {
        MergeIntervals solver = new MergeIntervals();

        // 🧪 Example 1
        int[][] intervals1 = {{1, 4}, {4, 5}};
        System.out.println("Output 1: " + Arrays.deepToString(solver.merge(intervals1)));
        System.out.println("Expected: [[1, 5]]\n");

        // 🧪 Example 2
        int[][] intervals2 = {{4, 7}, {1, 4}};
        System.out.println("Output 2: " + Arrays.deepToString(solver.merge(intervals2)));
        System.out.println("Expected: [[1, 7]]\n");
    }

    public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

            List<int[]> res = new ArrayList<>();
            int[] current_interval = intervals[0];
            res.add(current_interval);

            for(int i = 1;i<intervals.length;i++){

                if(intervals[i][0]<=current_interval[1]){
                    current_interval[1] = Math.max(current_interval[1],intervals[i][1]);
                }
                else{
                    res.add(intervals[i]);
                    current_interval = intervals[i];
                }
            }

            return res.toArray(new int[res.size()][]);
        }
}
