package maths;

public class Lcm {

  private static int lcm(int a, int b){

      int max = Math.max(a,b);
      int result = a*b;
      for(int i = max;i<result;i++){
          if(i%a ==0 && i%b==0)
          {
              result = i;
              break;
          }
      }
      return result;
  }
  
  
  private static int gcd(int a,int b){
      if(b==0)
          return a;
      return gcd(b,a%b);
  }
    
  public static int bestSolutionToFindLCM(int a , int b){
      return ((a*b)/gcd(a,b));
  }
    public static void main(String[] args){
        System.out.println(lcm(60,36));    // Output: 180
        System.out.println(lcm(10, 5));    // Output: 10
        System.out.println(lcm(8, 12));    // Output: 24
        System.out.println(lcm(100, 25));  // Output: 100
        System.out.println(lcm(81, 27));   // Output: 81
        
        System.out.println(bestSolutionToFindLCM(60,36));    // Output: 180
        System.out.println(bestSolutionToFindLCM(10, 5));    // Output: 10
        System.out.println(bestSolutionToFindLCM(8, 12));    // Output: 24
        System.out.println(bestSolutionToFindLCM(100, 25));  // Output: 100
        System.out.println(bestSolutionToFindLCM(81, 27));   // Output: 81

    }

}
