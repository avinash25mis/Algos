package com.stringSlider.subArray;

public class Intro {

    /*
    * finding all the subArray in a string (of a particular length n)
    * 1. finding sum of all subarray of the string
    * 2.
    *
    *
    *
    * */

    /*
    *
    * let us see the most naive way of doing it
    * */
    public static void main(String[] args) {
        //naive1();
        naive2();
    }

    private static void naive1() {
        int k=3;
        int arr[] = {2, 2, 3, 4, 5};
        int sum = 0;
        //either i <= arr.length-k  or i < arr.length-k+1
        for (int i = 0; i <= arr.length-k; i++) {
            for (int j = 0; j <3; j++) {
                sum = sum + arr[i+j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    private static void naive2() {
        int k=3;
        int arr[] = {2, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length-k+1; i++) {
            for (int j = i; j<i+3; j++) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
