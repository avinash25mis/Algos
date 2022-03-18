package com.a_Logics;

public class SlidingWayToFindMaxCount {


    /*
    * this logic can be used in following set of pattern
    * find longest consecutive repetitive elements
    * find Longest consecutive  increasing/decreasoing sequence (where difference could be 1 or more)
    *
    *
    * */
    public static void main(String[] args) {
      int arr[]= {2,2,4,4,5,5,6,6,6};
      findCount(arr);
    }


 /*
 * imp point to note here is we start with i=1 and not i=0
 * and we move forward and compare with previous number
 *
 * Honestly its a better approach
 *
 * */
    public static void findCount(int arr[]) {
        int count = 1;
        int maxCount = -1;
        int maxCountElement=-1;
        int temp = arr[0]; //main logic is to choose a number count it occurence and move right
        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                count++;
            } else {
                count = 1;
                temp = arr[i];
            }
            if (count > maxCount) {
                maxCount = count;
                maxCountElement=arr[i];
            }

        }

        System.out.println("Max consective count is :"+maxCount);
        System.out.println("Max consective number is :"+maxCountElement);
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



}
