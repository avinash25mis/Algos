package com.stringSlider;


/*
* find the longest non repetative
* O(n*n*n)
* */
public class LongestNonRepit1 {

    public static void main(String[] args) {
       String str="aavinasha";
       // String str="vishal";
        getLongestNonRepeting(str);
    }

    private static void getLongestNonRepeting(String str) {
        int maxLength=0;
        int startIndex=-1;
        int endIndex=-1;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(StringSliderUtils.checkByCharAt(str,i,j)){
                    //maxLength=Math.max(maxLength,j-i+1);
                    if(j-i+1>maxLength) {
                        maxLength=j-i+1;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        String substring = str.substring(startIndex, endIndex+1);
        System.out.println("Max Length :"+maxLength);
        System.out.println("Max String:"+substring);


    }
}
