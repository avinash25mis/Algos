package com.recursions;

public class Palindrome {

    public static void main(String[] args) {
        String str="abc";
        boolean isPalindrome = checkPalindrome(str, 0, str.length()-1);
        System.out.println(isPalindrome);
    }

    private static boolean checkPalindrome(String str, int i, int l) {
        if(i>=l){
            return true;
        }
        if(str.charAt(i)!=str.charAt(l)){
              return false;
        }
        return checkPalindrome(str,++i,--l);
    }

    /*
      Recursion time complexity
    * In one function call, we are doing an O(1)
    * recursive call is being done for at most n/2 times
    * Thus the overall complexity will be O(n)
    *
    * */






    private static boolean isPalindromeBasic(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
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
