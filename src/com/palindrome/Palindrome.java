package com.palindrome;

public class Palindrome {




    public static void main(String[] args) {
        String str="abc";
        isPalindromeBasic(str);

    }


    private static boolean isPalindromeBasic(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        StringBuilder sbTemp=strBuilder;
        strBuilder.append("tttt");
        strBuilder.reverse();

        return strBuilder.toString().equals(str);
    }

    private static boolean isPalindromeBasicByLoop(String str) {
        if (str == null)
            return false;
        int length=str.length();
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - 1- i)) //comparison  can be done via single i
                return false;
        }
        return true;
    }
}
