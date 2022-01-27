package com.longestCosecutive;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveAndIncreasing {

    public static void main(String[] args) {
        int arr[]={1, 8, 2, 4, 5, 6, 1};
        findLongestConsecutive(arr);
        findLongestConsecutiveViaArray(arr);
    }

    private static void findLongestConsecutiveViaArray(int[] arr) {
        int count=1;  //count and longest has to be 1 by default
        int longest=-1;


        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                count++;
            }else{
                count=1;
            }
            longest= Math.max(longest,count);
        }

        System.out.println("longest length :"+longest);
    }

    private static void findLongestConsecutive(int[] arr) {
        List<Integer> list= new ArrayList<>();

        int longest=1; //count and longest has to be 1 by default
        int count=1;

       //generally this portion is to remove duplicate but here just doing for no reason
        for (int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);

        }


        // i will be from 0 as list  start from 0
        for (int i = 0; i < list.size(); i++)
        {
            // Check if the current element is just one digit greater/smaller than previous element
            if ( i!=0 && (list.get(i) == list.get(i - 1) + 1) ) {
                count++;
            }
            else {
                count = 1;
                //resetting the counter
            }
            // recording the counter at each traversal
            longest = Math.max(longest, count);

        }
        System.out.println("count via list :"+longest);

    }




    /*
   for removing duplicates while

      for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] != arr[i - 1]){
                list.add(arr[i]);
                }

        }


    * */
}
