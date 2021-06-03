package com.stringSlider;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
to check if all charater of string are unique
to check if the strong contains no repititation*/
public class StringSlider1 {

    public static void main(String[] args) {
        String string="avinash";
       boolean allUnique = checkByCharAt(string);
       boolean allUnique2 = checkByBooleanArray(string);
       System.out.println(allUnique);
        //checkSet();
        //checkMap();
    }

    private static void checkSet() {
        Set<String> set= new HashSet<>();
        boolean a = set.add("a");
        System.out.println(a);
        boolean b = set.add("a");
        System.out.println(b);
    }


    private static void checkMap() {
        Map<String,String> map= new HashMap<>();
        String put = map.put("a", "avinash");
        System.out.println(put);
        String put2 = map.put("a", "abbbas");
        System.out.println(put2);

        System.out.println(map);
    }

    /*
    * this solution would be best if it is defined that we have either all lower case or all uppercase
    * same code can work for upper case also if we
    * 1. call the below method after doing string.toLowercase()
    * 2. replace arr[string.charAt(i)-'a'  by arr[string.charAt(i)-'a'
    *
    * please note that in above statement -'a' would be at RHS or it will strat giving
    * negative values and indexouttofbound exceotion
    *
    * but unforrtunetely this might fail if we have a combination of
    *  lower and upper case both and we are to consider 'a' & 'A' as different character
    * */
    public static boolean checkByBooleanArray(String string) {
        boolean allUnique=true;
        boolean [] arr= new boolean[26];

       for(int i=0;i<string.length();i++){
           if(arr[string.charAt(i)-'a']==true){
               allUnique=false;
               return allUnique;
           }else{
               arr[string.charAt(i)-'a']=true;
           }
       }

        return allUnique;
    }




    public static boolean checkByCharAt(String string) {
      boolean allUnique=true;
        Set<Character> set= new HashSet<>();

      for(int i=0;i<string.length();i++){
          char c = string.charAt(i);
          if(set.contains(string.charAt(i))){
              allUnique=false;
              return allUnique;
          }else{
           set.add(string.charAt(i));
          }
      }
      return  allUnique;
    }

    public static boolean checkByCharAt(String string, int i,int j) {
        boolean allUnique=true;
        Set<Character> set= new HashSet<>();

        for(int k=i;k<=j;k++){
            char c = string.charAt(k);
            if(set.contains(c)){
                allUnique=false;
                return allUnique;
            }else{
                set.add(c);
            }
        }
        return  allUnique;
    }
}
