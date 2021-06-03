package com.tricks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndList {
    public static void main(String[] args) {
        arrayToArrayList();
        stringToArray();
        stringToArrayJava8();
    }

    private static void arrayToArrayList() {
        Integer arr1[] = {1, 4, 3, 2};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));

        int arr2[] = {1, 4, 3, 2};
        // List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));//gives error as ArrayList constructor only supports objects
        //  List<Integer> list2=Arrays.asList(arr2);  this also does not work here as per below implementation
     /*   public static <T> List<T> asList(T... a) {
            return new Arrays.ArrayList<>(a);
        }*/
    }


    private static void stringToArray() {

        String [] str = {"123", "345", "437", "894"};
        int size = str.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            //arr[i] = Integer.parseInt(str[i]);
            arr[i] = Integer.valueOf(str[i]);//both gives valid result
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void stringToArrayJava8() {
        String string = "123 345 437 894";

        int[] array = Arrays.stream(string.split(" ")).mapToInt(Integer::parseInt).toArray();
        //Integer[] array = Arrays.stream(string.split(" ")).mapToInt(Integer::parseInt).toArray();
       //gives error as mapToInt returns premitive
    }
}
