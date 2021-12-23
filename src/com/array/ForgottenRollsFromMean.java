package com.array;

/**
 * @author avinash.a.mishra
 *
 * rolling a dice n number of time, calculated the mean m but
 * forgot certain elements k from the rolls
 */
public class ForgottenRollsFromMean {
  public static void main(String arg[]){
       int[] remembered={3,2,4,3};
       int forgot=2;
       int actualMean=4;  //12+/6
/*         function should return [6,5]*/
      solution(remembered,forgot,actualMean);
  }
    public static int[] solution(int[] A, int F, int M) {
        int currentSum=0;
        int forgot[]=new int[F];
        int notPossible[]=new int[1];
        int totalElement=F+A.length;
        for(int i=0;i<A.length;i++){
            currentSum=currentSum+A[i];
        }

        if(F<1|| M<1|| M>6){
            return notPossible;
        }
     //mean=sum/totalElement
        int actualSum=(M*totalElement)-currentSum;
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
