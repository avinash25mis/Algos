package com.recursions;

public class Palindrome {
    public static void main(String[] args) {
        String str="nmadamn";
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
    * more advance way
    * */

    public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))

            return isPal(s.substring(1, s.length()-1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }
}
