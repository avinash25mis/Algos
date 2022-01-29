package com.array;

/**
 * @author avinash.a.mishra
 *
 * find the missing number in the sequence of number
 *
 * sum of n numbers is = n * (n + 1) / 2;
 */
public class FindMissingNumber {
    static int getMissingNo(int a[], int n)
    {
        int idealSum = n * (n + 1) / 2;
        int sum = 0;

        for(int i = 0; i < n - 1; i++)
            sum += a[i];

        return idealSum - sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 4, 5, 6 };
        int n = a.length + 1;
        int miss = getMissingNo(a, n);

        System.out.print(miss);
    }
}
