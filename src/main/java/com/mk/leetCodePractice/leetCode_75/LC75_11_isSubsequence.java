package com.mk.leetCodePractice.leetCode_75;

public class LC75_11_isSubsequence {
    // 392. Is Subsequence

    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        int sLength = s.length();

        int index = 0;
        int tLength = t.length();

        for (char c: s.toCharArray()){
            for (int j=index ; j<tLength ; j++){
                if (c == t.charAt(j)) {
                    count++;
                    index =  j+1;
                    break;
                }
            }
        }

        return count == sLength;
    }

    public static boolean isSubsequence2(String s, String t) {
        // Get lengths of both strings
        int sLength = s.length();
        int tLength = t.length();

        // Initialize two pointers:
        // sPointer - tracks current position in string s
        // tPointer - tracks current position in string t
        int sPointer = 0;
        int tPointer = 0;

        // Iterate through both strings simultaneously
        while (sPointer < sLength && tPointer < tLength) {
            // If characters match, move pointer in s forward
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            // Always move pointer in t forward
            tPointer++;
        }

        // If we've matched all characters in s, it's a subsequence
        return sPointer == sLength;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("ace", "abcde"));
    }

}
