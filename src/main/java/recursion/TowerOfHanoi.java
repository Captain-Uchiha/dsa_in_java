package recursion;

public class TowerOfHanoi {


    static void solution(int n, char a, char c, char b){

        if(n==0)
            return;

        solution(n-1,a,b,c);
        System.out.println(a +"->" + c);
        solution(n-1,b,c,a);

    }

    public static void main(String[] args) {
        solution(3,'a','b','c');
    }
}
