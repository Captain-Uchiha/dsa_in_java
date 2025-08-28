package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * A total of n people are standing in a circle, and you are one of them playing a game. Starting from a person, k persons will be counted in order along the circle, and the kth person will be killed. Then the next k persons will be counted along the circle, and again the kth person will be killed. This cycle will continue until only a single person is left in the circle.
 * If there are 5 people in the circle in the order A, B, C, D, and E, you will choose k=3. Starting from A, you will count A, B and C. C will be the 3rd person and will be killed. Then you will continue counting from D, E and then A. A will be third person and will be killed.
 * You will be given an array where the first element is the first person from whom the counting will start and the subsequent order of the people. You want to be the last one standing. Determine the index at which you should stand to survive the game. Return an integer denoting safe position.
 * Examples :
 * Input: n = 3, k = 2
 * Output: 3
 * Explanation: There are 3 persons so skipping 1 person i.e 1st person 2nd person will be killed. Thus the safe position is 3.
 * Input: n = 5, k = 3
 * Output: 4
 * Explanation: There are 5 persons so skipping 2 person i.e 3rd person will be killed. Thus the safe position is 4.
 */
public class JosephusCircleAlgo {

    int josephus(int n, int k) {
        return -1;

    }


    static List<Integer> findLuckyMan(int n, int curr, List<Integer> list, int k){

        if(list.size()==n-1)
            return list;
        int negK = 0;
        for(int i =curr;i<=n;i++){
            if(!list.contains(i))
                negK++;
             if(negK==k)
            {
                list.add(i);
            }
        }
        return findLuckyMan(n,0,list,k);

    }

    public static void main(String[] args) {
        System.out.println( findLuckyMan(5,1,new ArrayList<>(),3));
    }
}
