package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author avinash.a.mishra
 * currently incomplete
 */
public class RolllRankAndMark {

    public static void main(String[] args) {
        int arr[]={12, 15, 7, 87, 89,15, 67, 89, 99};
        printRankAndRoll(arr);
    }

    private static void printRankAndRoll(int[] actual) {
        Map<Integer,Integer> markToRoll= new HashMap<>();
        int[] arr = Arrays.copyOf(actual, actual.length);
        for(int i=0;i<arr.length;i++){
            markToRoll.put(arr[i],i);
        }
        Arrays.sort(arr);
        System.out.println("Marks,Rank");
        int rank=1;
        int counter=0;
        int lastMark=arr[arr.length-1];
        System.out.print(lastMark);
        System.out.print(","+rank);
        System.out.println();

        for(int i=arr.length-2;i>=0;i--){
            System.out.print(","+arr[i]);

            if(lastMark==arr[i]){
                counter++;
            }
            if(counter==0) {
                rank ++;
                System.out.print(rank);
            }else{
                if(lastMark!=arr[i]){
                    System.out.println(rank+counter);
                    counter=0;
                }else{
                    System.out.println(rank);
                }
            }


            lastMark=arr[i];
            System.out.println();
        }

    }
}
