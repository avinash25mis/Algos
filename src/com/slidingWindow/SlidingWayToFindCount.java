package com.slidingWindow;

public class SlidingWayToFindCount {


    /*
    * this logic can be used in following set of pattern
    * find longest consecutive repetitive elements
    * find Longest consecutive  increasing/decreasoing sequence (where difference could be 1 or more)
    *
    *
    * */
    public static void main(String[] args) {
     // int arr[]= {2,2,4,4,5,5,6,6,6};
      int arr[]= {2,1,2,3,4,5,6,6,6};

      switch(1){
          case 1:
              findConsecSameNumCount(arr);
          break;

          case 2:
              findLongestConsecutive(arr);
           break;

          case 3:
              findLongestConsecutiveAnother(arr);
            break;

      }

    }


 /*
 * imp point to note here is we start with i=1 and not i=0
 * and we move forward and compare with previous number
 *
 * Honestly its a better approach
 *
 * */
    public static void findConsecSameNumCount(int arr[]) {
        int count = 1;
        int maxCount = -1;
        int maxCountElement=-1;
        int theNum = arr[0]; //main logic is to choose a number count it occurence and move right
        for (int i = 1; i < arr.length; i++) {
            if (theNum == arr[i]) {
                count++;
            } else {
                count = 1;
                theNum = arr[i];
            }
            if (count > maxCount) {
                maxCount = count;
                maxCountElement=arr[i];
            }

        }

        System.out.println("Max consective count is :"+maxCount);
        System.out.println("The number is :"+maxCountElement);
    }

    private static void findLongestConsecutive(int[] arr) {
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


    private static void findLongestConsecutiveAnother(int[] arr) {
        int count=1;  //count and longest has to be 1 by default
        int longest=-1;

        int theNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==theNum+1){
                count++;
            }else{
                count=1;
            }
            theNum=arr[i];
            longest= Math.max(longest,count);
        }

        System.out.println("longest length :"+longest);
    }



}
