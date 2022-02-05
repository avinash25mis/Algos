package com.slidingWindow.subArray;

/**
 * @author avinash.a.mishra
 *
 * find the maximum continuous sum from the array
 */
public class MaxSumContiguesSubArray {

    public static void main(String[] args) {
        int[] a = {60, -3, -4, 10,20 ,5, -1, -5, -3};
        maxSubArraySum(a);
    }

    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;

            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        System.out.println("Maximum contiguous sum is " +max_ending_here);
        return max_so_far;



    }
}
