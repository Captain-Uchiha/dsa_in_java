package recursion;

public class RecursivePower {

    static int recursivePower(int n,int p)
    {
        if(p==0)
            return 1;
        if(p==1)
            return n;
        if(p%2==0){
            int k = recursivePower(n,p/2);
            return k*k;
        }
        else
            return n*recursivePower(n,p-1);
    }

    public static void main(String[] args) {

        System.out.println(recursivePower(2,2));
        System.out.println(recursivePower(2,1));

    }
}
