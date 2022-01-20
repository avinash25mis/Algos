package com.removeRepeatitive;

/**
 * @author avinash.a.mishra
 */
public class RemoveRepititionInString {

    public static void main(String[] args) {
        String str="baac";


        replaceAllRepetition(str,2);
    }

    private static String replaceAllRepetition(String str, int k) {
        int arr[]=new int[126];
        boolean foundReption=false;
        boolean start=true;

        while (foundReption || start) {
            start=false;
            for (int i = 0; i < str.length(); i++) {
                int val = arr[str.charAt(i)];
                  val++ ;
                arr[str.charAt(i)]=val;
                  if(val==k){
                      foundReption=true;
                  }
            }
            if(!foundReption){
                break;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == k) {
                    char a = (char) j;
                    str = str.replaceAll(Character.toString(a), "");
                }
            }
        }
        return str;
    }
}
