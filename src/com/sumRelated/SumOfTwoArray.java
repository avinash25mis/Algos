package com.sumRelated;

import java.util.Arrays;

public class SumOfTwoArray {


    /*
    * remember
    *
    *  3 % 10 == 3, use remender to store the sum
    *  3 /10 == 0,  use actuall divide the get the carry digit
    *
    * */
    public static void main(String[] args) {
        int arr1[]={2,6,6};
        int arr2[]={3,5,5};
        getTheSum(arr1,arr2);


    }

    /*
    * note this solution is going to work only if both array has same length
    * */

    private static void getTheSum(int[] arr1, int[] arr2) {
        int carry=0;
        int max=Math.max(arr1.length,arr2.length);
        int arr3[]= new int[max];
        for(int i=0;i<arr1.length && i<arr2.length;i++){

            int sum=carry+arr1[i]+arr2[i];
            carry=sum/10;
            arr3[i]=sum % 10; //sum to be sorted is the left most bit

        }

        System.out.println(Arrays.toString(arr3));
    }
}
