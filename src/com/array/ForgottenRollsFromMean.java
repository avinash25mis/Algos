package com.array;

/**
 * @author avinash.a.mishra
 */
public class ForgottenRollsFromMean {
  public static void main(String arg[]){
       int[] arr={3,2,4,3};
       int f=2;
       int m=4;
/*         function should return [6,5]*/
      solution(arr,f,m);
  }
    public static int[] solution(int[] A, int F, int M) {
        int sum=0;
        int forgot[]=new int[F];
        int notPossible[]=new int[1];
        int total=F+A.length;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }

        if(F<1|| M<1|| M>6){
            return notPossible;
        }

        int actualSum=(M*total)-sum;
        if(F>actualSum || actualSum/F>6){
            return notPossible;
        }

        for(int j=0;j<forgot.length;j++){
            forgot[j]=actualSum/F--;
            actualSum=actualSum-forgot[j];
        }
        return forgot;
    }
}
