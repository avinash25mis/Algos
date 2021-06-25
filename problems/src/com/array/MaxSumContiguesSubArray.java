package com.array;

/**
 * @author avinash.a.mishra
 */
public class MaxSumContiguesSubArray {

    public static void main(String[] args) {
        int[] a = {-2, -3, -4, 10,20 ,5, -1, -5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[]) {
        int start=-1;
        int end=-1;
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                end=i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
