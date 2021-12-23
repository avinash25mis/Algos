package com.stringSlider.longestNonRepeatitive;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author avinash.a.mishra
 */
public class LongestNonRepeatN {

    public static void main(String[] args) {
        String str="aavinasha";
        // String str="vishal";
        getLongestNonRepeatingByArray(str);
        getLongestNonRepeatingByMap(str);
    }

    private static int getLongestNonRepeatingByMap(String str) {

        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        // starting the inital point of window to index 0
        int start = 0;

        for(int end = 0; end < str.length(); end++)
        {
            // Checking if we have already seen the element or not
            if(seen.containsKey(str.charAt(end)))
            {
                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(str.charAt(end)) + 1);
            }

            // Updating the last seen value of the character
            seen.put(str.charAt(end), end);
            maximum_length = Math.max(maximum_length, end-start + 1);
        }
        return maximum_length;
    }

    private static int getLongestNonRepeatingByArray(String str) {


        int longest = 0; // result
        int bigining=-1;
        int ending=-1;

        // last index of all characters is initialized
        // as -1
        int [] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);

        // Initialize start of current window
        int i = 0;

        // Move end of current window
        for (int j = 0; j < str.length(); j++) {

            // Find the last index of str[j]
            // if found Update i (starting index of current window)
             // else -1+1=0  which will never be max
            i = Math.max(i, lastIndex[str.charAt(j)] + 1);



            // Update last index of j.
            lastIndex[str.charAt(j)] = j;

            // Update result if we get a larger window
            if(longest<j-i+1){
                bigining=i;
                ending=j;
                longest=j-i+1;
            }

            //longest = Math.max(longest, j - i + 1);

        }

        System.out.println("Longest length");
        return longest;
    }
}
