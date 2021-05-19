package com.sumRelated;

import java.util.Arrays;
/*
* finding the index of the array that make the sum  and if they are sorted
* */
public class SumB {

    public static void main(String[] args) {
        int[] nums={2,3,4};
        int target=6;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {

      //  Arrays.sort(nums);
        int [] result= new int[2];

        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(nums[i]+nums[j]==target){
                result[0] =i;
                result[1] =j;
                break;
            }else{
                if(nums[i]+nums[j]>target){
                    j--;
                }else{
                    i++;
                }
            }

        }

        return result;
    }
}
