package com.a_Logics;

public class PalindromCoreLogic {


    public static void main(String[] args) {
        String str="akakd";
        coreLogic(0,2,str);
    }


    /*
    * this is a core logic for finding palindrome for a subString of the actuall string
    *
    * */
    //j-i+1     (+1 since k starting from 0)
    public static void coreLogic(int i,int j,String str){
        boolean flag=true;
        for (int k = 0; k < (j - i + 1) / 2; k++) {
            if (str.charAt(i + k) != str.charAt(j - k)) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
