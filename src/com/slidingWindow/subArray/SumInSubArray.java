package com.slidingWindow.subArray;

/**
 * @author avinash.a.mishra
 *
 * find the given sum in any sub-array of the array
 */
public class SumInSubArray {

    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;
        findSumInSubArray(arr,sum);
    }

    /*
       we keep i (start) at the fist position
    * we keep moving j and add all element from the i till j
    * if we cross the target sum then we move i towards right and find sum till j again
    *
    * */

    private static int findSumInSubArray(int[] arr, int reqSum) {

        int curr_sum = arr[0], start = 0;

        // Pick a starting point
        for (int j = 1; j <= arr.length; j++) {

            // If curr_sum becomes equal to reqSum,
            if (curr_sum == reqSum) {
                int p = j - 1;
                System.out.println("Sum found between indexes " + start + " and " + p);
                break;
            }
            if(j<arr.length) {
                curr_sum = curr_sum + arr[j];
            }

            // If curr_sum exceeds the reqSum,
            // then move the starting elements
            while (curr_sum > reqSum && start <= j - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }




        }

        return 0;
    }

}
