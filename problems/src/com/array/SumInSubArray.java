package com.array;

/**
 * @author avinash.a.mishra
 */
public class SumInSubArray {

    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;
        findSumInSubArray(arr,sum);
    }

    private static int findSumInSubArray(int[] arr, int reqSum) {

        int curr_sum = arr[0], start = 0;

        // Pick a starting point
        for (int i = 1; i <= arr.length; i++) {
            // If curr_sum exceeds the reqSum,
            // then remove the starting elements
            while (curr_sum > reqSum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to reqSum,
            // then return true
            if (curr_sum == reqSum) {
                int p = i - 1;
                System.out.println("Sum found between indexes " + start + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
          //  if (i < arr.length)
                curr_sum = curr_sum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }

}
