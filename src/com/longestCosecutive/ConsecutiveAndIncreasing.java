package com.longestCosecutive;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveAndIncreasing {

    public static void main(String[] args) {
        int arr[]={1, 9, 3, 4, 3, 4, 3};
        findLongestConsecutive(arr);
    }

    private static void findLongestConsecutive(int[] arr) {
        List<Integer> list= new ArrayList<>();
        //int count=0;
        int longest=0;
        //removing duplicate
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        for (int i = 0,count=0; i < list.size(); i++)
        {

            // Check if the current element is
            // equal to previous element +1
            if (i > 0 && ((list.get(i) == list.get(i - 1) + 1) || (list.get(i) == list.get(i - 1) -1))) {
                count++;
            }
            else {
                count = 1;
            }

            // Update the maximum
            longest = Math.max(longest, count);

        }


    /*    for (int i = 0,count=0; i < list.size(); i++)
        {

            // Check if the current element is
            // equal to previous element +1
            if (i > 0 && list.get(i) == list.get(i - 1) - 1) {
                count++;
            }
            else {
                count = 1;
            }

            // Update the maximum
            longest = Math.max(longest, count);

        }*/



        System.out.println(longest);

    }
}
