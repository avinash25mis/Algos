package com.a_Logics;

import java.util.Arrays;

public class MissingNumbrsIfSumGiven {

    public static void main(String[] args) {
        getAwayToASum(13,3);
    }


    /*
     * Find the numbers which will constitute the sum
     *
     * */
    public static void getAwayToASum(int requiredSum,int forgotenCount){
       //to enable dice conditions and other conditions
        if(forgotenCount==0|| requiredSum/forgotenCount>6 || forgotenCount>requiredSum){
            System.out.println("Not possible");
            return;
        }

        int [] forgotArray = new int[forgotenCount];
        for(int j=0;j<forgotArray.length;j++){
            forgotArray[j]=requiredSum/forgotenCount--;
            requiredSum=requiredSum-forgotArray[j];
        }

        System.out.println(Arrays.toString(forgotArray));

    }
}
