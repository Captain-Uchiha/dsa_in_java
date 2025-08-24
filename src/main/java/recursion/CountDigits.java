package recursion;

public class CountDigits {


    static  int countDigits(int n,int digits){
        if(n==0)
            return digits;

        return countDigits(n/10,++digits);
    }
    public static void main(String[] args) {
        System.out.println(countDigits(1,0));
    }
}
