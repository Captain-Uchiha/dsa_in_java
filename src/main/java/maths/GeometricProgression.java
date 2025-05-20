package maths;

public class GeometricProgression {

    public static double nThTermInGP(int firstTerm,int secondTerm,int n){

        double commonRatio = (double) secondTerm /firstTerm;
        return firstTerm*Math.pow(commonRatio,n-1);

    }

    public static void main(String[] args){
        System.out.println(nThTermInGP(1,2,5));
    }
}
